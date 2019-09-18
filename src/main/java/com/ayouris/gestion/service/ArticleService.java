package com.ayouris.gestion.service;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Categorie;
import com.ayouris.gestion.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    //Getters
    public List<Article> getArticles(){ return articleRepository.findAll(); }
    public Optional<Article> getById(int id){ return articleRepository.findById(id); }
    public Optional<Article> getByLibelle(String libelle){ return articleRepository.findByLibelle(libelle); }
    public List<Article> getByPrix(float prix){ return  articleRepository.findByPrix(prix); }
    public List<Article> getByCategorie(Categorie categorie){ return articleRepository.findByCategorie(categorie); }
    public List<Article> getByCategorieId(int id){ return articleRepository.findByCategorieId(id); }
    public List<Article> getByCategorieLibelle(String libelle){ return articleRepository.findByCategorieLibelle(libelle); }

    //Add
    public void addOne(Article article){ articleRepository.save(article); }
    public void addMultiple(Iterable<Article> articles){ articleRepository.saveAll(articles); }

    //Update
    public void update(Article article){ articleRepository.save(article); }

    //Delete
    public void deleteById(int id){ articleRepository.deleteById(id); }
    public void deleteByLibelle(String libelle){ articleRepository.deleteByLibelle(libelle); }
}