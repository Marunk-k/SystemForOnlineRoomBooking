package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.Client;
import com.project.hotelBookingSystem.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/client")
@RestController
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/getAll")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return client;
    }

    @PutMapping("/update")
    public String updateClient(@RequestBody Client client) {
        clientService.updateClient(client);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "Success";
    }

}
