/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.model;

/**
 *
 * @author david
 */
public class Libro {

    private int id;
    private String titolo;
    private String autore;
    private int annoDiPubblicazione;
    private boolean disponibile;

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    //Sovrascrizioe del toString per evitare l'hashcode
    @Override
    public String toString() {
        return "Libro{"
                + "id = " + id
                + ", titolo = " + titolo
                + ", autore = " + autore
                + ", annoDiPubblicazione = " + annoDiPubblicazione
                + ", disponibile = " + disponibile
                + '}';
    }

    //Builder per inizializzare i campi senza usare i costruttori
    public static class Builder {

        private Libro libro = new Libro();

        public Builder id(int id) {
            libro.setId(id);
            return this;
        }

        public Builder titolo(String titolo) {
            libro.setTitolo(titolo);
            return this;
        }

        public Builder autore(String autore) {
            libro.setAutore(autore);
            return this;
        }

        public Builder annoDiPubblicazione(int annoDiPubblicazione) {
            libro.setAnnoDiPubblicazione(annoDiPubblicazione);
            return this;
        }

        public Builder disponibile(boolean disponibile) {
            libro.setDisponibile(disponibile);
            return this;
        }

        public Libro build() {
            return libro;
        }

    }

}
