package com.tpFinalSpring.gestionnaire.controller;

import com.tpFinalSpring.gestionnaire.modeles.Client;
import com.tpFinalSpring.gestionnaire.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping(value = "/clients")
public class ClientResourceController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = {"/",""})
    public String getClients(Model model){

        List<Client> clients=clientService.getClients();
        model.addAttribute ("clients",clients);

        return "index";

    }

    @PostMapping("addNew")
    public Client addClient(@RequestBody Client client){
        return  clientService.addClient(client);

    }


    @GetMapping(value = "/{id}")
    public Client getClient(@PathVariable("id") int id){
        return  clientService.getClient(id);

    }

    @PutMapping(value = "update/{id}")
    public Client updateClient(@PathVariable("id") int id, @RequestBody  Client client){
        return  clientService.updateClient(id, client);

    }

    @DeleteMapping(value = "delete/{id}")
    public void deleteClient(@PathVariable("id") int id){
        clientService.deleteClient(id);

    }

}
