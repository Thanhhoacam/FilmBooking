/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewMode;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HistoryBooking {
    private int bookingId;
    private String seat;
    private String film;
    private Date date;

    public HistoryBooking() {
    }

    public HistoryBooking(int bookingId, String seat, String film, Date date) {
        this.bookingId = bookingId;
        this.seat = seat;
        this.film = film;
        this.date = date;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HistoryBooking{" + "bookingId=" + bookingId + ", seat=" + seat + ", film=" + film + ", date=" + date + '}';
    }   
    
}
