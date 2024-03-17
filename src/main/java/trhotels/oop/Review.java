package trhotels.oop;

import java.util.Date;

public class Review {
    private User user;
    private Hotel hotel;
    private int rating;
    private String comment;
    private Date date;

    public Review(User user, Hotel hotel, int rating, String comment) {
        this.user = user;
        this.hotel = hotel;
        this.rating = rating;
        this.comment = comment;
        this.date = new Date();
    }

    // Getters
    public User getUser() {
        return user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    // Setters
    public void setUser(User user) {
        this.user = user;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
