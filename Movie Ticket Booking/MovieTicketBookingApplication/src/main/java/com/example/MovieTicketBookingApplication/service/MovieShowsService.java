package com.example.MovieTicketBookingApplication.service;

import com.example.MovieTicketBookingApplication.entity.MovieShows;
import com.example.MovieTicketBookingApplication.repository.MovieShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepository movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public List<MovieShows> showsList(){
        return movieShowsRepository.findAll();
    }
    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }
    public  Boolean existsById(Long id){
        return movieShowsRepository.existsById(id);
    }
}
