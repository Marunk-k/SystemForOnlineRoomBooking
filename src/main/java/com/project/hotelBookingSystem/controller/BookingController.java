package com.project.hotelBookingSystem.controller;


import com.project.hotelBookingSystem.entity.AppUser;
import com.project.hotelBookingSystem.entity.Booking;
import com.project.hotelBookingSystem.service.BookingService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/booking")
@RestController
@AllArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/getAll")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/getByUserId/{id}")
    public Optional<Booking> getBookingByUserId(@PathVariable Long id) {
        return bookingService.getBookingByUserId(id);
    }

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
        return booking;
    }

    @PutMapping("/update")
    public String updateBooking(@RequestBody Booking booking) {
        bookingService.updateBooking(booking);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return "Success";
    }
}
