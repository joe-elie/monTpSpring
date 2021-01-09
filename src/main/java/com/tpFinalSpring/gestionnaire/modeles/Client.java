package com.tpFinalSpring.gestionnaire.modeles;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int idClient;
    @JsonProperty("prenom")
    private String prenomClient;
    @JsonProperty("nom")
    private String nomClient;
    @JsonProperty("courriel")
    private String courrielClient;

    public Client() {
    }

    public Client(int idClient, String prenomClient, String nomClient, String courrielClient) {
        this.idClient = idClient;
        this.prenomClient = prenomClient;
        this.nomClient = nomClient;
        this.courrielClient = courrielClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }



    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setCourrielClient(String courrielClient) {
        this.courrielClient = courrielClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getCourrielClient() {
        return courrielClient;
    }



}
