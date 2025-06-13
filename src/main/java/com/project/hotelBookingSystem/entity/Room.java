package com.project.hotelBookingSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "is_occupied", nullable = false)
    private boolean isOccupied;

    @Column(name = "price_per_day", nullable = false)
    private Integer pricePerDay;
}
