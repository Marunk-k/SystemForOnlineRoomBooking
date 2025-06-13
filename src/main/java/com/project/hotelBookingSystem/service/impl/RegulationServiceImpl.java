package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.Regulation;
import com.project.hotelBookingSystem.repository.RegulationRepository;
import com.project.hotelBookingSystem.service.RegulationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegulationServiceImpl implements RegulationService {
    private RegulationRepository regulationRepository;

    @Override
    public List<Regulation> getAllRegulations() {
        return regulationRepository.findAll();
    }

    @Override
    public Regulation addRegulation(Regulation regulation) {
        regulationRepository.save(regulation);
        return regulation;
    }

    @Override
    public String updateRegulation(Regulation regulation) {
        regulationRepository.save(regulation);
        return "Successfully updated regulation!";
    }

    @Override
    public String deleteRegulation(Long id) {
        if (!regulationRepository.existsById(id)) {
            return "Regulation not found";
        }
        regulationRepository.deleteById(id);
        return "Regulation successfully deleted";
    }
}
