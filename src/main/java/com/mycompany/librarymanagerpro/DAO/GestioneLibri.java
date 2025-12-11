/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.DAO;

import com.mycompany.librarymanagerpro.model.Libro;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class GestioneLibri {

    private static final Logger LOGGER = Logger.getLogger(GestioneLibri.class.getName());

    private Map<Integer, Libro> archivioLibri = new HashMap<>();

    //Operazioni CRUD
    public void addLibro(Libro libro) {
        if (archivioLibri.containsKey(libro.getId())) {
            LOGGER.warning("[ATTENZIONE] il libro già è presente nell'archivio");
        }

        archivioLibri.put(libro.getId(), libro);
        LOGGER.info("Libro aggiunto con successo");
    }

    //Metodo per cercare un libro spefico
    public Libro getById(int id) {
        return archivioLibri.get(id);
    }

    //Stampiamo solo i valori dell' archizio, no le key
    public void stampaLista() {
        for (Libro libro : archivioLibri.values()) {
            System.out.println(" " + libro.getTitolo() + " " + libro.getAutore());
        }
        LOGGER.info("Stampa riuscita");
    }

    //TODO Davide: Da controllare BENE la logica di aggiornamento del metodo aggiorna + Builder
    public void aggiorna(int id, Libro libro) {
        Libro libri = archivioLibri.get(id);

        if (libro == null) {
            LOGGER.warning("Libro non trovato");
            return;
        }
        
        libri.setTitolo(libro.getTitolo());
        libri.setAutore(libro.getAutore());
        libri.setAnnoDiPubblicazione(libro.getAnnoDiPubblicazione());
        libri.setDisponibile(libro.isDisponibile());
    }

    public void elimina(int id) {
        if (archivioLibri.containsKey(id)) {
            archivioLibri.remove(id);
            LOGGER.info("Libro rimosso dall'archivio");
        } else {
            LOGGER.warning("Errore");
        }
    }

}
