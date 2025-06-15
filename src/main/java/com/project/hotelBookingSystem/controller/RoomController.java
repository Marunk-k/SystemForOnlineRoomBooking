package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.Regulation;
import com.project.hotelBookingSystem.entity.Room;
import com.project.hotelBookingSystem.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/room")
@RestController
@AllArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/getAll")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/getById/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    @GetMapping("/findRoomsWithoutCost")
    public List<Room> getAvailableRoomsWithoutCost(
            @RequestParam LocalDate checkInDate,
            @RequestParam LocalDate checkOutDate,
            @RequestParam int guestCount) {
        return roomService.getAvailableRoomsWithoutCost(checkInDate, checkOutDate, guestCount);
    }

    @GetMapping("/findRoomsWithCost")
    public List<Room> getAvailableRoomsWithCost(
            @RequestParam LocalDate checkInDate,
            @RequestParam LocalDate checkOutDate,
            @RequestParam int guestCount,
            @RequestParam int minPricePerDay,
            @RequestParam int maxPricePerDay) {
        return roomService.getAvailableRoomsWithCost(checkInDate, checkOutDate, guestCount, minPricePerDay, maxPricePerDay);
    }



    @PostMapping("/add")
    public Room addRoom(@RequestBody Room room) {
        roomService.addRoom(room);
        return room;
    }

    @PutMapping("/update")
    public String updateRoom(@RequestBody Room room) {
        roomService.updateRoom(room);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return "Success";
    }
}
