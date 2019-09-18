package com.ayouris.gestion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    private String libelle;

    @Getter
    @Setter
    @OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Article> articles;
}
