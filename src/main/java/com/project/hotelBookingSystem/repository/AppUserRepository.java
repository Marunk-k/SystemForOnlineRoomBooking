package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmailAndPassword(String email, String password);

    Optional<AppUser> findByPhoneAndPassword(String phone, String password);
}
