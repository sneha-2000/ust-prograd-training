package com.example.movieTicketBookingApplication.repository;

import com.example.movieTicketBookingApplication.entity.Movie;
import com.example.movieTicketBookingApplication.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieShowRepository extends JpaRepository<MovieShow,Long> {
    @Query("Select movieShow from MovieShow movieShow where movieShow.movie=:movie")
    List<MovieShow> findShowByMovieId(Movie movie);
}
