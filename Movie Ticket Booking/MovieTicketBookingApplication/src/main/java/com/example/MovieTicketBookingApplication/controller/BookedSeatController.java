package com.example.MovieTicketBookingApplication.controller;

import com.example.MovieTicketBookingApplication.entity.BookedSeats;
import com.example.MovieTicketBookingApplication.entity.Seats;
import com.example.MovieTicketBookingApplication.service.BookedSeatService;
import com.example.MovieTicketBookingApplication.service.CustomerService;
import com.example.MovieTicketBookingApplication.service.MovieShowsService;
import com.example.MovieTicketBookingApplication.service.SeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookedSeatController {
    @Autowired
    private BookedSeatService bookedSeatService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private MovieShowsService movieShowsService;
    @Autowired
    private CustomerService customerService;
//    @Autowired
//    private SeatService seatService;

    @GetMapping("/seats/{id}")
    public String seats(@PathVariable Long id, Model model) {
        model.addAttribute("shows", id);
        return "seats";
    }

    @GetMapping("/booked/{shows}")
    public String booked(@PathVariable Long shows, Model model) {
        model.addAttribute("shows", shows);
        return "booked";
    }

    @PostMapping("/booked/{shows}")
    public String seatBooked(@PathVariable Long shows, HttpServletRequest request, Model model) {
        String bookSeats = request.getParameter("bookedSeats");
        String[] bookedSeat = bookSeats.split(",");
        Integer seatCount=bookedSeat.length;
        model.addAttribute("seatCount",seatCount);
        Integer amount=seatCount*200;
        model.addAttribute("amount",amount);

        for (String seat : bookedSeat) {
            Seats seats = seatService.getBySeats(seat);
            if (bookedSeatService.existsByMovieShowsId(shows)) {
                if (bookedSeatService.existsBySeats(seat)) {
                    model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
                    return "seats";
                    //return "redirect:/seats/" + shows;
                } else {
                    BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
                    bookedSeats.setMovieShows(movieShowsService.getById(shows));
                    bookedSeatService.saveSeat(bookedSeats);
                }
            } else {
                BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
                bookedSeats.setMovieShows(movieShowsService.getById(shows));
                bookedSeatService.saveSeat(bookedSeats);
            }

        }
        return "booked";
    }

//    for (String seat : bookedSeat) {
//        Seats seats = seatService.getBySeats(seat);
//        if (bookedSeatService.existsByMovieShowsId(shows) && bookedSeatService.existsBySeats(seat)) {
//            model.addAttribute("message", seat + " Seat is already booked. Please choose another seat");
//            return "seats";
//            //return "redirect:/seats/" + shows;
//        } else {
//            BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
//            bookedSeats.setMovieShows(movieShowsService.getById(shows));
//            bookedSeatService.saveSeat(bookedSeats);
//        }
//
//    }
}
