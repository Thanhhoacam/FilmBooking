package DAO;

import DAO.DBContext;
import ViewMode.HistoryBooking;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Seat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class BookingDao extends DBContext {

    public List<Seat> getSeatIsBooking(int showid) {
        List<Seat> seats = new ArrayList<>();
        try {
            String sql = "select s.seatId, s.seatName from seat s right join booking_detail bd on s.seatId = bd.seatId\n"
                    + "                  right join booking b on bd.bookingId = b.bookingId \n"
                    + "                   right join show sh on b.showId = sh.showId\n"
                    + "                   where b.showId = ? order by s.seatId asc";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, showid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Seat s = new Seat();
                s.setSeatId(rs.getInt("seatId"));
                s.setSeatName(rs.getString("seatName"));
                seats.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return seats;
    }

    public int totalSeatIsBooking() {
        try {
            String sql = "select COUNT(bookingId) as count from booking_detail";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public void deleteBooking(String bid) {
        try {
            String sql = "Delete booking where [bookingId] = " + bid;
            PreparedStatement booking = connection.prepareCall(sql);
            booking.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int bookingSeat(int showId, int userId, String[] seat) {
        int status = 0;
        try {
            connection.setAutoCommit(false);
            String sqlBooking = "INSERT INTO [dbo].[booking]\n"
                    + "           ([showId]\n"
                    + "           ,[userId])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";
            PreparedStatement booking = connection.prepareCall(sqlBooking);
            booking.setInt(1, showId);
            booking.setInt(2, userId);
            booking.executeUpdate();

            int bookingId = 0;
            String sql_get_id = "Select @@Identity as bId";
            PreparedStatement stm_get_id = connection.prepareStatement(sql_get_id);
            ResultSet rs = stm_get_id.executeQuery();
            if (rs.next()) {
                bookingId = rs.getInt("bId");
            }
            for (String s : seat) {
                String sql_b_detail = "INSERT INTO [dbo].[booking_detail]\n"
                        + "           ([bookingId]\n"
                        + "           ,[seatId])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?)";
                PreparedStatement bDetail = connection.prepareCall(sql_b_detail);
                bDetail.setInt(1, bookingId);
                bDetail.setInt(2, Integer.parseInt(s));
                bDetail.executeUpdate();
            }
            connection.commit();
            status = 1;
        } catch (Exception e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, e);
            try {
                connection.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }

    public List<HistoryBooking> getHistoryBooking(int userId) {
        List<HistoryBooking> hb = new ArrayList<>();
        try {
            String sql = "select s.seatName, b.bookingId, f.Title , sh.showDate from seat s left join booking_detail bd on s.seatId = bd.seatId\n"
                    + "                            left join booking b on bd.bookingId = b.bookingId \n"
                    + "                                   left join show sh on b.showId = sh.showId\n"
                    + "								   left join [user] u on b.userId = u.[user_id]\n"
                    + "								   left join [Films] f on sh.filmId = f.FilmID\n"
                    + "								   where b.userId = ? order by b.bookingId desc";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, userId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                HistoryBooking h = new HistoryBooking();
                h.setBookingId(rs.getInt("bookingId"));
                h.setDate(rs.getDate("showDate"));
                h.setFilm(rs.getString("title"));
                h.setSeat(rs.getString("seatName"));
                hb.add(h);
            }
            return hb;
        } catch (SQLException ex) {
            Logger.getLogger(BookingDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public static void main(String[] args) {
        BookingDao db = new BookingDao();
        List<HistoryBooking> seats = db.getHistoryBooking(3);
        System.out.println(seats.size());

    }

}
