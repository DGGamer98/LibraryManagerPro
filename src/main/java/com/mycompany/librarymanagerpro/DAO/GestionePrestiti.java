/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.DAO;

import com.mycompany.librarymanagerpro.model.Libro;
import com.mycompany.librarymanagerpro.model.Prestito;
import com.mycompany.librarymanagerpro.model.Utente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class GestionePrestiti {

    private static final Logger LOGGER = Logger.getLogger(GestionePrestiti.class.getName());

    private List<Prestito> prestiti = new ArrayList<>();

    public void prestaLibro(Utente u, Libro l) {
        if (!l.isDisponibile()) {
            System.out.println("Il libro non è disponibile");
        }

        Prestito p = new Prestito(u, l);

        prestiti.add(p);
        l.setDisponibile(false);
        LOGGER.info("Libro prestato a: " + u.getUsername());
    }

    public void restituisciLibro(int idLibro) {
        for (int i = 0; i < prestiti.size(); i++) {
            if (prestiti.get(i).getLibro().getId() == idLibro) {
                prestiti.remove(i);
            }
        }
        LOGGER.info("Libro restituito");
    }

    public void stampaPrestiti() {
        for (Prestito prestito : prestiti) {
            System.out.println(prestito);
        }
    }

}
