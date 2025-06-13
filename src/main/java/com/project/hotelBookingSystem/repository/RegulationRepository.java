package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Regulation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegulationRepository extends JpaRepository<Regulation, Long> {
}
