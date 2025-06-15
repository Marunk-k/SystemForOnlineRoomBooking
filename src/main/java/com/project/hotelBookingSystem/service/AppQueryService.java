package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.AppQuery;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AppQueryService {
    List<AppQuery> getAllAppQuery();
    AppQuery getAppQueryById(@PathVariable Long id);
    AppQuery addAppQuery(AppQuery appQuery);
    String updateAppQuery(AppQuery appQuery);
}
