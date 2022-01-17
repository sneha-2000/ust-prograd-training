package com.example.movieTicketBookingApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class BookedSeats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long seatId;
    private Long showId;
//    @JsonIgnore
//    @ManyToOne
//    private MovieShow movieShow;

    public BookedSeats(){
    }

    public BookedSeats(Long userId, Long seatId, Long showId) {
        this.userId = userId;
        this.seatId = seatId;
        this.showId = showId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

//    public MovieShow getMovieShow() {
//        return movieShow;
//    }
//
//    public void setMovieShow(MovieShow movieShow) {
//        this.movieShow = movieShow;
//    }
}
