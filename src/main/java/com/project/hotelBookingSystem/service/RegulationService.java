package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Regulation;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RegulationService {
    List<Regulation> getAllRegulations();
    Regulation getRegulationById(Long id);
    Regulation addRegulation(Regulation regulation);
    String updateRegulation(Regulation regulation);
    String deleteRegulation(Long id);
}
