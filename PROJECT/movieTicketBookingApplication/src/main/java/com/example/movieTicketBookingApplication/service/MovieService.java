package com.example.movieTicketBookingApplication.service;

import com.example.movieTicketBookingApplication.entity.Movie;
import com.example.movieTicketBookingApplication.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long movieId) {
        return movieRepository.getById(movieId);
    }



}
