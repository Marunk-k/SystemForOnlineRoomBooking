package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
