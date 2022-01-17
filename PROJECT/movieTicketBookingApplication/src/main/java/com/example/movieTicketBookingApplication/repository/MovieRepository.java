package com.example.movieTicketBookingApplication.repository;

import com.example.movieTicketBookingApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
