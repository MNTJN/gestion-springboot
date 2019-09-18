package com.ayouris.gestion.controller;

import com.ayouris.gestion.model.Commande;
import com.ayouris.gestion.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    //Getters
    @GetMapping("/all")
    public List<Commande> getCommandes(){ return commandeService.getCommandes(); }

    @GetMapping("/id/{id}")
    public Optional<Commande> getById(@PathVariable int id){ return commandeService.getById(id); }

    @GetMapping("/numero/{numero}")
    public Optional<Commande> getByNumero(@PathVariable String numero){ return commandeService.getByNumero(numero); }

    //Add
    @PostMapping("/add-one")
    public void addOne(@RequestBody Commande commande){ commandeService.addOne(commande); }

    @PostMapping("/add-multiple")
    public void addMultiple(@RequestBody Iterable<Commande> commandes){ commandeService.addMultiple(commandes); }

    //Update
    @PutMapping("/update")
    public void update(@RequestBody Commande commande){ commandeService.update(commande); }

    //Delete
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id){ commandeService.deleteById(id); }

    @DeleteMapping("/numero/{numero}")
    public void deleteByNumero(@PathVariable String numero){ commandeService.deleteByNumero(numero); }
}
