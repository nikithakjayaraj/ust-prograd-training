package com.example.MovieTicketBookingApplication.repository;

import com.example.MovieTicketBookingApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
