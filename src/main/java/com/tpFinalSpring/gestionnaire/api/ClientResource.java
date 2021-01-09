package com.tpFinalSpring.gestionnaire.api;

import com.tpFinalSpring.gestionnaire.modeles.Client;
import com.tpFinalSpring.gestionnaire.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ServiceClient serviceClient;

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return  serviceClient.addClient(client);

    }

    @GetMapping
    public List<Client> getClients(){
        return  serviceClient.getClients();

    }

    @GetMapping(value = "/{id}")
    public Client getClient(@PathVariable("id") int id){
        return  serviceClient.getClient(id);

    }

    @PutMapping(value = "/{id}")
    public Client updateClient(@PathVariable("id") int id, @RequestBody  Client client){
        return  serviceClient.updateClient(id, client);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteClient(@PathVariable("id") int id){
        serviceClient.deleteClient(id);

    }

}
