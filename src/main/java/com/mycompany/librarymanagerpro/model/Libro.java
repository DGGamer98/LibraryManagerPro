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

    //Creo il costruttore privato per non instanziarlo nel main
    private Libro(Builder builder) {
        this.id = builder.id;
        this.titolo = builder.titolo;
        this.autore = builder.autore;
        this.annoDiPubblicazione = builder.annoDiPubblicazione;
        this.disponibile = builder.disponibile;
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

        private int id;
        private String titolo;
        private String autore;
        private int annoDiPubblicazione;
        private boolean disponibile;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder titolo(String titolo) {
            this.titolo = titolo;
            return this;
        }

        public Builder autore(String autore) {
            this.autore = autore;
            return this;
        }

        public Builder annoDiPubblicazione(int annoDiPubblicazione) {
            this.annoDiPubblicazione = annoDiPubblicazione;
            return this;
        }

        public Builder disponibile(boolean disponibile) {
            this.disponibile = disponibile;
            return this;
        }

        public Libro build() {
            return new Libro(this);
        }

    }

}
