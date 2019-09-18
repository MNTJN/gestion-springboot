package com.ayouris.gestion.controller;

import com.ayouris.gestion.model.Categorie;
import com.ayouris.gestion.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    //Getters
    @GetMapping("/all")
    public List<Categorie> getCategories(){ return categorieService.getCategories(); }

    @GetMapping("/id/{id}")
    public Optional <Categorie> getById(@PathVariable int id){ return categorieService.getById(id); }

    @GetMapping("/libelle/{libelle}")
    public Optional <Categorie> getByLibelle(@PathVariable String libelle){ return categorieService.getByLibelle(libelle); }

    //Add
    @PostMapping("/add-one")
    public void addOne(@RequestBody Categorie categorie){ categorieService.addOne(categorie); }

    @PostMapping("/add-multiple")
    public void addMultiple(Iterable<Categorie> categories){ categorieService.addMultiple(categories);}

    //Update
    @PutMapping("/update")
    public void update(@RequestBody Categorie categorie){ categorieService.update(categorie); }

    //Delete
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id){ categorieService.deleteById(id); }

    @DeleteMapping("/libelle/{libelle}")
    public void deleteByLibelle(@PathVariable String libelle){ categorieService.deleteByLibelle(libelle); }
}