package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> getAllAppUsers();
    AppUser isUserExist(String login, String password);
    AppUser addAppUser(AppUser appUser);
    String updateAppUser(AppUser appUser);
    String deleteAppUser(Long id);
}
