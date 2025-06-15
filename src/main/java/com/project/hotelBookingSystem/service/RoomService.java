package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Regulation;
import com.project.hotelBookingSystem.entity.Role;
import com.project.hotelBookingSystem.entity.Room;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;


public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomById(Long id);
    List<Room> getAvailableRoomsWithoutCost(LocalDate checkInDate, LocalDate checkOutDate, int guestCount);
    List<Room> getAvailableRoomsWithCost(LocalDate checkInDate, LocalDate checkOutDate, int guestCount, int minPricePerDay, int maxPricePerDay);
    Room addRoom(Room room);
    String updateRoom(Room room);
    String deleteRoom(Long id);
}
