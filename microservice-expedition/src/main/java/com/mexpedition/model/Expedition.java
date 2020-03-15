package com.mexpedition.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Expedition {

    @Id
    @GeneratedValue
    private int id;
    private int idcommande;
    private boolean etat;

    public Expedition() {
    }

    public Expedition(int id, int idcommande, boolean etat) {
        this.id = id;
        this.idcommande = idcommande;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcommande() {
        return idcommande;
    }

    public void setIdcommande(int idcommande) {
        this.idcommande = idcommande;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Expedition{" +
                "id=" + id +
                ", idcommande=" + idcommande +
                ", etat=" + etat +
                '}';
    }
}
