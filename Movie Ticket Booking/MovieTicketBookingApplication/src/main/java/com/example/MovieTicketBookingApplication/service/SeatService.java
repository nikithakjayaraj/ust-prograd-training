package com.example.MovieTicketBookingApplication.service;

import com.example.MovieTicketBookingApplication.entity.Seats;
import com.example.MovieTicketBookingApplication.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}
