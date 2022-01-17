package com.example.movieTicketBookingApplication.service;


import com.example.movieTicketBookingApplication.entity.Movie;
import com.example.movieTicketBookingApplication.entity.MovieShow;
import com.example.movieTicketBookingApplication.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowService {
    @Autowired
    private MovieShowRepository movieShowRepository;


    public MovieShow saveMovieShow(MovieShow movieShow) {
        return movieShowRepository.save(movieShow);
    }

    public List<MovieShow> getAllShows() {
        return movieShowRepository.findAll();
    }

    public List<MovieShow> getShowByMovieId(Movie movie){
        return movieShowRepository.findShowByMovieId(movie);
    }

    public MovieShow getShowById(Long id) {
        return  movieShowRepository.getById(id);
    }
}
