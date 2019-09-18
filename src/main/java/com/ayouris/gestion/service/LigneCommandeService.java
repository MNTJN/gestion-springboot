package com.ayouris.gestion.service;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Commande;
import com.ayouris.gestion.model.LigneCommande;
import com.ayouris.gestion.repository.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LigneCommandeService {

    @Autowired
    private LigneCommandeRepository ligneCommandeRepository;

    //Getters
    public List<LigneCommande> getLignes(){ return ligneCommandeRepository.findAll(); }
    public Optional<LigneCommande> getByArticle(Article article){ return ligneCommandeRepository.findByArticle(article); }
    public Optional<LigneCommande> getByCommande(Commande commande){ return ligneCommandeRepository.findByCommande(commande); }

    //Add
    public void addOne(LigneCommande ligneCommande){ ligneCommandeRepository.save(ligneCommande); }
    public void addMultiple(Iterable<LigneCommande> lignesCommande){ ligneCommandeRepository.saveAll(lignesCommande); }

    //Update
    public void update(LigneCommande ligneCommande){ ligneCommandeRepository.save(ligneCommande); }

    //Delete
    public void deleteByArticle(Article article){ ligneCommandeRepository.deleteByArticle(article); }
    public void deleteByCommande(Commande commande){ ligneCommandeRepository.deleteByCommande(commande); }
}