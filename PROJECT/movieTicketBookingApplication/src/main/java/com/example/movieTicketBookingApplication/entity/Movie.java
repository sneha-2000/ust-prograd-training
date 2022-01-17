package com.example.movieTicketBookingApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {
    @Id
    private Long movieId;
    @Column(nullable = false)
    private String movieName;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String movieGenre;
    @Column(nullable = false)
    private Integer numberOfTicketsAvailable;
    @Column(nullable = false)
    private Double price;

    @OneToMany(mappedBy = "movie")
    private List<MovieShow> movieShow;

    public Movie(){}

    public Movie(String movieName, String date, String movieGenre, Integer numberOfTicketsAvailable, Double price) {
        this.movieName = movieName;
        this.date = date;
        this.movieGenre = movieGenre;
        this.numberOfTicketsAvailable = numberOfTicketsAvailable;
        this.price = price;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Integer getNumberOfTicketsAvailable() {
        return numberOfTicketsAvailable;
    }

    public void setNumberOfTicketsAvailable(Integer numberOfTicketsAvailable) {
        this.numberOfTicketsAvailable = numberOfTicketsAvailable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<MovieShow> getMovieShow() {
        return movieShow;
    }

    public void setMovieShow(List<MovieShow> movieShow) {
        this.movieShow = movieShow;
    }
}
