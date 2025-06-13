package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.AppUser;
import com.project.hotelBookingSystem.repository.AppUserRepository;
import com.project.hotelBookingSystem.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService {
    private AppUserRepository appUserRepository;

    @Override
    public List<AppUser> getAllAppUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser isUserExist(String login, String password) {
        Optional<AppUser> user = appUserRepository.findByEmailAndPassword(login, password);
        if (user.isPresent()) {
            return user.get();
        } else {
            user = appUserRepository.findByPhoneAndPassword(login, password);
            if (user.isPresent()) {
                return user.get();
            }
        }
        return null;
    }

    @Override
    public AppUser addAppUser(AppUser appUser) {
        appUserRepository.save(appUser);
        return appUser;
    }

    @Override
    public String updateAppUser(AppUser appUser) {
        appUserRepository.save(appUser);
        return "Successfully updated app user!";
    }

    @Override
    public String deleteAppUser(Long id) {
        if (!appUserRepository.existsById(id)) {
            return "App user not found";
        }
        appUserRepository.deleteById(id);
        return "App user successfully deleted";
    }
}
