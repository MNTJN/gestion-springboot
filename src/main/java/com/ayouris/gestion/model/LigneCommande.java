package com.ayouris.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(LigneCommandeId.class)
public class LigneCommande {

    @Id
    @Getter
    @Setter
    @ManyToOne
    private Commande commande;

    @Id
    @Getter
    @Setter
    @ManyToOne
    private Article article;

    @Getter
    @Setter
    private int quantite;
}
