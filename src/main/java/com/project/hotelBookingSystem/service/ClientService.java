package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    Client addClient(Client client);
    String updateClient(Client client);
    String deleteClient(Long id);
}
