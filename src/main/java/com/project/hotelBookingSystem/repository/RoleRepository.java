package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
