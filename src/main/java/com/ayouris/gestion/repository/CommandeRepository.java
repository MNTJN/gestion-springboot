package com.ayouris.gestion.repository;

import com.ayouris.gestion.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

    //Getters
    public Optional<Commande> findById(int id);
    public Optional<Commande> findByNumero(String numero);

    //Delete
    public void deleteById(int id);
    public void deleteByNumero(String numero);
}