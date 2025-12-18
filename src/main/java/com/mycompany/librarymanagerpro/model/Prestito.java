/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.model;

/**
 *
 * @author david
 */
public class Prestito {
    private Utente utente;
    private Libro libro;

    public Prestito(Utente utente, Libro libro) {
        this.utente = utente;
        this.libro = libro;
    }

    
    
    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
}
