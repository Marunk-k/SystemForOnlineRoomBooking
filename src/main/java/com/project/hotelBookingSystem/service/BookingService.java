package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Booking;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> getAllBookings();
    Optional<Booking> getBookingByUserId(Long id);
    Booking addBooking(Booking booking);
    String updateBooking(Booking booking);
    String deleteBooking(Long id);
}
