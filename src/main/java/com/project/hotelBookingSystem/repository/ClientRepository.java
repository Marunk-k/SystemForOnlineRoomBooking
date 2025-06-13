package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
