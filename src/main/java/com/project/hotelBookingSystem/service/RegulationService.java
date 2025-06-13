package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Regulation;

import java.util.List;

public interface RegulationService {
    List<Regulation> getAllRegulations();
    Regulation addRegulation(Regulation regulation);
    String updateRegulation(Regulation regulation);
    String deleteRegulation(Long id);
}
