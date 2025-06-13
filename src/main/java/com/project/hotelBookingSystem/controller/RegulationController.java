package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.Regulation;
import com.project.hotelBookingSystem.service.RegulationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/regulation")
@RestController
@AllArgsConstructor
public class RegulationController {
    private final RegulationService regulationService;
    @GetMapping("/getAll")
    public List<Regulation> getAllRegulations() {
        return regulationService.getAllRegulations();
    }

    @PostMapping("/add")
    public Regulation addRegulation(@RequestBody Regulation regulation) {
        regulationService.addRegulation(regulation);
        return regulation;
    }

    @PutMapping("/update")
    public String updateRegulation(@RequestBody Regulation regulation) {
        regulationService.updateRegulation(regulation);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRegulation(@PathVariable Long id) {
        regulationService.deleteRegulation(id);
        return "Success";
    }
}
