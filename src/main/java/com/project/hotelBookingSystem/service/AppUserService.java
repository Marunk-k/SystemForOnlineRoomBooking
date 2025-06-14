package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.AppUser;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AppUserService {
    List<AppUser> getAllAppUsers();
    AppUser getAppUserById(Long id);
    AppUser isUserExist(String login, String password);
    AppUser addAppUser(AppUser appUser);
    String updateAppUser(AppUser appUser);
    String deleteAppUser(Long id);
}
