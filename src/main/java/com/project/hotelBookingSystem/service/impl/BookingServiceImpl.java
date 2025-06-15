package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.Booking;
import com.project.hotelBookingSystem.repository.BookingRepository;
import com.project.hotelBookingSystem.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Optional<Booking> getBookingByUserId(Long id) {
        return bookingRepository.findById(id);
    }


    @Override
    public Booking addBooking(Booking booking) {
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public String updateBooking(Booking booking) {
        bookingRepository.save(booking);
        return "Successfully updated booking!";
    }

    @Override
    public String deleteBooking(Long id) {
        if (!bookingRepository.existsById(id)) {
            return "User not found";
        }
        bookingRepository.deleteById(id);
        return "Booking successfully deleted";
    }
}
