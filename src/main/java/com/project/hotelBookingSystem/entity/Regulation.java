package com.project.hotelBookingSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "regulation")
public class Regulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "regulation_name", nullable = false)
    private String regulationName;

    @Column(name = "file_link", nullable = false)
    private String fileLink;
}
