package com.ayouris.gestion.controller;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Commande;
import com.ayouris.gestion.model.LigneCommande;
import com.ayouris.gestion.service.LigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("/lignes")
public class LigneCommandeController {

    @Autowired
    LigneCommandeService ligneCommandeService;

    //Getters
    @GetMapping("/all")
    public List<LigneCommande> getLignes(){ return ligneCommandeService.getLignes(); }

    @GetMapping("/article/{article}")
    public Optional<LigneCommande> getByArticle(@PathVariable Article article){ return ligneCommandeService.getByArticle(article); }

    @GetMapping("/commande/{commande}")
    public Optional<LigneCommande> getByCommande(@PathVariable Commande commande){ return ligneCommandeService.getByCommande(commande); }

    //Add
    @PostMapping("/add-one")
    public void addOne(@RequestBody LigneCommande ligneCommande){ ligneCommandeService.addOne(ligneCommande); }

    @PostMapping("/add-multiple")
    public void addMultiple(@RequestBody Iterable<LigneCommande> lignesCommande){ ligneCommandeService.addMultiple(lignesCommande); }

    //Update
    @PutMapping("/update")
    public void update(@RequestBody LigneCommande ligneCommande){ ligneCommandeService.update(ligneCommande); }

    //Delete
    @DeleteMapping("/article/{article}")
    public void deleteByArticle(@PathVariable Article article){ ligneCommandeService.deleteByArticle(article); }

    @DeleteMapping("/commande/{commande}")
    public void deleteByCommande(@PathVariable Commande commande){ ligneCommandeService.deleteByCommande(commande); }

}
