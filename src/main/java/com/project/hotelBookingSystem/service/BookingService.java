package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Booking;
import com.project.hotelBookingSystem.entity.Client;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking addBooking(Booking booking);
    String updateBooking(Booking booking);
    String deleteBooking(Long id);
}
