package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.AppUser;
import com.project.hotelBookingSystem.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/app_user")
@RestController
@AllArgsConstructor
public class AppUserController {
    private final AppUserService appUserService;

    @GetMapping("/getAll")
    public List<AppUser> getAllAppUsers() {

        return appUserService.getAllAppUsers();
    }

    @GetMapping("/getById/{id}")
    public AppUser getAppUserById(@PathVariable Long id) {
        return appUserService.getAppUserById(id);
    }

    @GetMapping("/isUserExist/{login}/{password}")
    public AppUser isUserExist(@PathVariable String login, @PathVariable String password) {
        return appUserService.isUserExist(login, password);
    }

    @PostMapping("/add")
    public AppUser addAppUser(@RequestBody AppUser appUser) {
        appUserService.addAppUser(appUser);
        return appUser;
    }

    @PutMapping("/update")
    public String updateAppUser(@RequestBody AppUser appUser) {
        appUserService.updateAppUser(appUser);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAppUser(@PathVariable Long id) {
        appUserService.deleteAppUser(id);
        return "Success";
    }
}
