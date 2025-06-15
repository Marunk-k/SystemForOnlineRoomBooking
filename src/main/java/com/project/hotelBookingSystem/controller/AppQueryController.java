package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.AppQuery;
import com.project.hotelBookingSystem.entity.AppUser;
import com.project.hotelBookingSystem.service.AppQueryService;
import com.project.hotelBookingSystem.service.AppUserService;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/app_query")
@RestController
@AllArgsConstructor
public class AppQueryController {
    private final AppQueryService appQueryService;

    @GetMapping("/getAll")
    public List<AppQuery> getAllAppQuery() {
        return appQueryService.getAllAppQuery();
    }

    @PostMapping("/add")
    public AppQuery addAppQuery(@RequestBody AppQuery appQuery) {
        appQueryService.addAppQuery(appQuery);
        return appQuery;
    }

    @PutMapping("/update")
    public String updateAppQuery(@RequestBody AppQuery appQuery) {
        appQueryService.updateAppQuery(appQuery);
        return "Success";
    }
}
