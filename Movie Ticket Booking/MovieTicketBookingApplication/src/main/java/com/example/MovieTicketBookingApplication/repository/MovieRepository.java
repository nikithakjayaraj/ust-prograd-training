package com.example.MovieTicketBookingApplication.repository;

import com.example.MovieTicketBookingApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
