/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagerpro;

import com.mycompany.librarymanagerpro.VIEW.UserView;
import com.mycompany.librarymanagerpro.controller.UserController;
import com.mycompany.librarymanagerpro.model.Libro;
import com.mycompany.librarymanagerpro.model.Utente;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class LibraryManagerPro {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        //PRIMO TEST di LibraryManager
        Libro libro = new Libro.Builder()
                .id(1)
                .titolo("Divina Commedia")
                .autore("Dante Alighieri")
                .annoDiPubblicazione(1400)
                .disponibile(true)
                .build();
        
        System.out.println(libro);
        
        System.out.println("x-------------------------");

        /*
        SECONDO TESET di LibraryManager, per il pattern MVC
        */
        
        Utente model = new Utente();
        UserView view = new UserView();
        
        model.setUsername("Davide");
        model.setPassword("0909");
        
        UserController controller = new UserController(view);
        
        controller.registraUtente(model.getUsername(), model);
        
        System.out.println("Login");
        controller.login(model.getUsername(), model.getPassword());
        
        
  
    }
}
