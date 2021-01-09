package com.tpFinalSpring.gestionnaire.repositories;

import com.tpFinalSpring.gestionnaire.modeles.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    @Override
    List<Client> findAll();
}
