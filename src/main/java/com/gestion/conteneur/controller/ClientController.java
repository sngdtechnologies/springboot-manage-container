package com.gestion.conteneur.controller;

import com.gestion.conteneur.model.Client;
import com.gestion.conteneur.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.findAll();
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.save(client);
    }
}
