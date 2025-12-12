/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.controller;

import com.mycompany.librarymanagerpro.DAO.GestioneLibri;
import com.mycompany.librarymanagerpro.VIEW.UserView;
import com.mycompany.librarymanagerpro.model.Utente;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());
    
    private Map<String, Utente> utentiRegistrati;
    private UserView view;
    
    //Inizializzo la mappa

    public UserController(UserView view) {
        this.utentiRegistrati = new HashMap<>();
        this.view = view;
    }
    
    public void registraUtente(String username, Utente utente) {
        utentiRegistrati.put(username, utente);
        view.showRegistrationSuccess();
    }

    //Controllo se la key username è uagale al valore di utente
    public boolean login(String username, String password) {
        //Se la chiave non esiste
        if(!utentiRegistrati.containsKey(username)) {
            view.showLoginFail();
            return false;
        }
        
        //Prendo l'utente salvato in utentiRegistrati + creo un oggetto utenteRegistrato per confrontrla con la password
        Utente utenteRegistrato = utentiRegistrati.get(username);
        
        if(utenteRegistrato.getPassword().equals(password)) {
            view.showLoginSuccess();
            return true;
        } else {
            view.showLoginFail();
            return false;
        }
    }
    
    public void mosraUtente(Utente utente) {
       view.mosttradettagli(utente);
    }
}
