package com.tpFinalSpring.gestionnaire.services;

import com.tpFinalSpring.gestionnaire.dao.DAOClient;
import com.tpFinalSpring.gestionnaire.exceptions.ClientIntrouvableException;
import com.tpFinalSpring.gestionnaire.modeles.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ServiceClient {

    @Autowired
    private DAOClient daoClient;

    public Client addClient(Client client){
        return daoClient.save(client);
    }

    public List<Client> getClients(){
        return daoClient.findAll();
    }

    public Client getClient(int id){
        Optional<Client> clientOptionel = daoClient.findById(id);
        if(!clientOptionel.isPresent())
        {
            throw new ClientIntrouvableException("Aucun client avec cette ID, désolé !!");
        }
       return clientOptionel.get();
    }

    public Client updateClient(int id, Client client){
        client.setIdClient(id);
        return daoClient.save(client);
    }

    public void deleteClient (int id){
        daoClient.deleteById(id);

    }
}
