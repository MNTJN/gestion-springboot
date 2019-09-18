package com.ayouris.gestion.controller;

import com.ayouris.gestion.model.Article;
import com.ayouris.gestion.model.Categorie;
import com.ayouris.gestion.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //Getters
    @GetMapping("/all")
    public List<Article> getArticles(){ return articleService.getArticles(); }

    @GetMapping("/id/{id}")
    public Optional<Article> getById(@PathVariable int id){ return articleService.getById(id); }

    @GetMapping("/libelle/{libelle}")
    public Optional<Article> getByLibelle(@PathVariable String libelle){ return articleService.getByLibelle(libelle); }

    @GetMapping("/prix/{prix}")
    public List<Article> getByPrix(@PathVariable float prix){ return articleService.getByPrix(prix); }

    @GetMapping("/categorie/{categorie}")
    public List<Article> getByCategorie(@PathVariable Categorie categorie){ return articleService.getByCategorie(categorie); }

    @GetMapping("/categorie/id/{id}")
    public List<Article> getByCategorieId(@PathVariable int id){ return articleService.getByCategorieId(id); }

    @GetMapping("/categorie/libelle/{libelle}")
    public List<Article> getByCategorieLibelle(@PathVariable String libelle){ return articleService.getByCategorieLibelle(libelle); }

    //Add
    @PostMapping("/add-one")
    public void addOne(@RequestBody Article article){ articleService.addOne(article); }

    @PostMapping("/add-multiple")
    public void addMultiple(@RequestBody Iterable<Article> articles){ articleService.addMultiple(articles); }

    //Update
    @PutMapping("/update")
    public void update(@RequestBody Article article){ articleService.update(article); }

    //Delete
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id){ articleService.deleteById(id); }

    @DeleteMapping("/libelle/{libelle}")
    public void deleteByLibelle(@PathVariable String libelle){ articleService.deleteByLibelle(libelle); }
}
