package com.example.MovieTicketBookingApplication.repository;

import com.example.MovieTicketBookingApplication.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
