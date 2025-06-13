package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoomRepository extends JpaRepository<Room, Long> {
}
