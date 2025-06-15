package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.AppQuery;
import com.project.hotelBookingSystem.repository.AppQueryRepository;
import com.project.hotelBookingSystem.repository.AppUserRepository;
import com.project.hotelBookingSystem.service.AppQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppQueryServiceImpl implements AppQueryService {
    private AppQueryRepository appQueryRepository;

    @Override
    public List<AppQuery> getAllAppQuery() {
        return appQueryRepository.findAll();
    }

    @Override
    public AppQuery addAppQuery(AppQuery appQuery) {
        appQueryRepository.save(appQuery);
        return appQuery;
    }

    @Override
    public String updateAppQuery(AppQuery appQuery) {
        appQueryRepository.save(appQuery);
        return "Successfully updated app app query!";
    }
}
