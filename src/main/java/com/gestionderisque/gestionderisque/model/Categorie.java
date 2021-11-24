package com.gestionderisque.gestionderisque.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="nom",nullable = false)
    private String nom;

    @OneToMany(mappedBy = "categorie",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Risque> risques;

    public Categorie(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.substring(0,1).toUpperCase() + nom.substring(1).toLowerCase();
    }

    public List<Risque> getrisques() {
        return risques;
    }

    public void setProduits(List<Risque> risques) {
        this.risques = risques;
    }
}
