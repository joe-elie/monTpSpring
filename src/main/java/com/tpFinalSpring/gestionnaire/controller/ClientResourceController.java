package com.tpFinalSpring.gestionnaire.controller;

import com.tpFinalSpring.gestionnaire.modeles.Client;
import com.tpFinalSpring.gestionnaire.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResourceController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return  clientService.addClient(client);

    }

    @GetMapping
    public List<Client> getClients(){
        return  clientService.getClients();

    }

    @GetMapping(value = "/{id}")
    public Client getClient(@PathVariable("id") int id){
        return  clientService.getClient(id);

    }

    @PutMapping(value = "/{id}")
    public Client updateClient(@PathVariable("id") int id, @RequestBody  Client client){
        return  clientService.updateClient(id, client);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteClient(@PathVariable("id") int id){
        clientService.deleteClient(id);

    }

}
