package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.Room;
import com.project.hotelBookingSystem.repository.RoomRepository;
import com.project.hotelBookingSystem.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public List<Room> getAvailableRoomsWithoutCost(LocalDate checkInDate, LocalDate checkOutDate, int guestCount) {
        return roomRepository.getAvailableRoomsWithoutCost(checkInDate, checkOutDate, guestCount);
    }

    @Override
    public List<Room> getAvailableRoomsWithCost(LocalDate checkInDate, LocalDate checkOutDate, int guestCount, int minPricePerDay, int maxPricePerDay) {
        return roomRepository.getAvailableRoomsWithCost(checkInDate, checkOutDate, guestCount, minPricePerDay, maxPricePerDay);
    }

    @Override
    public Room addRoom(Room room) {
        roomRepository.save(room);
        return room;
    }

    @Override
    public String updateRoom(Room room) {
        roomRepository.save(room);
        return "Successfully updated room!";
    }

    @Override
    public String deleteRoom(Long id) {
        if (!roomRepository.existsById(id)) {
            return "Room not found";
        }
        roomRepository.deleteById(id);
        return "Room successfully deleted";
    }
}
