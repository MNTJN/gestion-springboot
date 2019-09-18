package com.ayouris.gestion.service;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Categorie;
import com.ayouris.gestion.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private ArticleService articleService;

    //Getters
    public List<Categorie> getCategories(){ return categorieRepository.findAll(); }
    public Optional<Categorie> getById(int id){ return categorieRepository.findById(id); }
    public Optional <Categorie> getByLibelle(String libelle){ return categorieRepository.findByLibelle(libelle); }

    //Add
    public void addOne(Categorie categorie){ categorieRepository.save(categorie); }
    public void addMultiple(Iterable<Categorie> categories){ categorieRepository.saveAll(categories); }

    //Update
    public void update(Categorie categorie){ categorieRepository.save(categorie); }

    //Delete
    public void deleteById(int id){ categorieRepository.deleteById(id); }
    public void deleteByLibelle(String libelle){ categorieRepository.deleteByLibelle(libelle); }
}