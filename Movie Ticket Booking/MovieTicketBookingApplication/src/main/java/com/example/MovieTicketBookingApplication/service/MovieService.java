package com.example.MovieTicketBookingApplication.service;

import com.example.MovieTicketBookingApplication.entity.Movie;
import com.example.MovieTicketBookingApplication.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> movieList(){
        return movieRepository.findAll();
    }
    public Movie getByMovieId(Long movieId){
        return movieRepository.getById(movieId);
    }
}
