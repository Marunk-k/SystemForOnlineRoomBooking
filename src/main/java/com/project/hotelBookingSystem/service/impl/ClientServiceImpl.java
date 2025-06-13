package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.Client;
import com.project.hotelBookingSystem.repository.ClientRepository;
import com.project.hotelBookingSystem.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    @Override
    public String updateClient(Client client) {
        clientRepository.save(client);
        return "Successfully updated user!";
    }

    @Override
    public String deleteClient(Long id) {
        if (!clientRepository.existsById(id)) {
            return "User not found";
        }
        clientRepository.deleteById(id);
        return "User successfully deleted";
    }
}
