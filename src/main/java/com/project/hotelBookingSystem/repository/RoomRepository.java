package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query(value = """
    SELECT * FROM room r
    WHERE r.capacity = :guestCount
      AND r.id NOT IN (
        SELECT b.room_id
        FROM booking b
        WHERE NOT (
          b.check_out_date <= :checkInDate OR
          b.check_in_date >= :checkOutDate
        )
    )
    """, nativeQuery = true)
    List<Room> getAvailableRoomsWithoutCost(@Param("checkInDate") LocalDate checkInDate,
                                  @Param("checkOutDate") LocalDate checkOutDate,
                                  @Param("guestCount") int guestCount);


    @Query(value = """
    SELECT * FROM room r
    WHERE r.capacity = :guestCount
      AND r.price_per_day BETWEEN :minPricePerDay AND :maxPricePerDay
      AND r.id NOT IN (
        SELECT b.room_id
        FROM booking b
        WHERE NOT (
          b.check_out_date <= :checkInDate OR
          b.check_in_date >= :checkOutDate
        )
    )
    """, nativeQuery = true)
    List<Room> getAvailableRoomsWithCost(@Param("checkInDate") LocalDate checkInDate,
                                         @Param("checkOutDate") LocalDate checkOutDate,
                                         @Param("guestCount") int guestCount,
                                         @Param("minPricePerDay") int minPricePerDay,
                                         @Param("maxPricePerDay") int maxPricePerDay);



}
