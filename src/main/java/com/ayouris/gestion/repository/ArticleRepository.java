package com.ayouris.gestion.repository;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

    //Getters
    public Optional <Article> findById(int id);
    public Optional <Article> findByLibelle(String libelle);
    public List<Article> findByPrix(float prix);
    public List<Article> findByCategorie(Categorie categorie);
    public List<Article> findByCategorieId(int id);
    public List<Article> findByCategorieLibelle(String libelle);

    //Delete
    public void deleteById(int id);
    public void deleteByLibelle(String libelle);
}