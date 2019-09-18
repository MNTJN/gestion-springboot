package com.ayouris.gestion.repository;

import com.ayouris.gestion.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

    //Getters
    public Optional <Categorie> findById(int id);
    public Optional <Categorie> findByLibelle(String libelle);

    //Delete
    public void deleteById(int id);
    public void deleteByLibelle(String libelle);
}
