package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Role;
import com.project.hotelBookingSystem.entity.Room;

import java.util.List;


public interface RoomService {
    List<Room> getAllRooms();
    Room addRoom(Room room);
    String updateRoom(Room room);
    String deleteRoom(Long id);
}
