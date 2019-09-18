package com.ayouris.gestion.service;

import com.ayouris.gestion.model.Commande;
import com.ayouris.gestion.model.LigneCommande;
import com.ayouris.gestion.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private LigneCommandeService ligneCommandeService;

    //Getters
    public List<Commande> getCommandes(){ return commandeRepository.findAll(); }
    public Optional<Commande> getById(int id){ return commandeRepository.findById(id); }
    public Optional<Commande> getByNumero(String libelle){ return commandeRepository.findByNumero(libelle); }

    //Add
    public void addOne(Commande commande){
        commande.setDate();
        commandeRepository.save(commande);
    }

    public void addMultiple(Iterable<Commande> commandes){
        commandes.forEach(
                commande -> {
                    commande.setDate();
                }
        );
        commandeRepository.saveAll(commandes);
    }

    //Update
    public void update(Commande commande){ commandeRepository.save(commande); }

    //Delete
    public void deleteById(int id){ commandeRepository.deleteById(id); }
    public void deleteByNumero(String numero){ commandeRepository.deleteByNumero(numero); }
}
