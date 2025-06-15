package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.AppUser;
import com.project.hotelBookingSystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByAppUserId(Long id);
}
