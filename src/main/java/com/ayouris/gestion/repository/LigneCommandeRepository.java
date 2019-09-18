package com.ayouris.gestion.repository;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Commande;
import com.ayouris.gestion.model.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Integer> {

    //Getters
    public Optional<LigneCommande> findByArticle(Article article);
    public Optional<LigneCommande> findByCommande(Commande commande);
    public List<LigneCommande> findByQuantite(int quantite);

    //Delete
    public void deleteByArticle(Article article);
    public void deleteByCommande(Commande commande);
}
