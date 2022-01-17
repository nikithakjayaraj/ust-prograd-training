package com.example.MovieTicketBookingApplication.repository;

import com.example.MovieTicketBookingApplication.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatRepository extends JpaRepository<BookedSeats, Long> {
    public Boolean existsBySeats(String seats);
    public Boolean existsByMovieShowsId(Long id);

    public List<BookedSeats> findByMovieShowsId(Long id);
}
