package com.example.MovieTicketBookingApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String userName;
    private String name;
    private String address;
    @Column(unique = true)
    private String password;
    @OneToMany(mappedBy = "customer")
    private List<BookedSeats> bookedSeats;

    public Customer() {
    }

    public Customer(String userName, String name, String address, String password) {
        this.userName = userName;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
