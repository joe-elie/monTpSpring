package com.tpFinalSpring.gestionnaire.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GestionPagePrincipale {

    @GetMapping
    public String home(){
        return "L'application est fonctionnelle en date du " + new Date();

    }
}
