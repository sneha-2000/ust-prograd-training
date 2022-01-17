package com.example.movieTicketBookingApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieShow {
    @Id
    private Long id;
    @Column(nullable = false)
    private String releaseDate;
    @Column(nullable = false)
    private String showTime;
    @JsonIgnore
    @ManyToOne
    private Movie movie;
//    @OneToMany(mappedBy = "movieShow")
//    private List<BookedSeats> bookedSeats;

    public MovieShow(){}

    public MovieShow(Movie movie, String releaseDate, String showTime) {
        this.movie = movie;
        this.releaseDate = releaseDate;
        this.showTime = showTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

//    public List<BookedSeats> getBookedSeats() {
//        return bookedSeats;
//    }
//
//    public void setBookedSeats(List<BookedSeats> bookedSeats) {
//        this.bookedSeats = bookedSeats;
//    }
}
