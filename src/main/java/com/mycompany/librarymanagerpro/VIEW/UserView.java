/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagerpro.VIEW;

import com.mycompany.librarymanagerpro.DAO.GestioneLibri;
import com.mycompany.librarymanagerpro.model.Utente;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class UserView {

    private static final Logger LOGGER = Logger.getLogger(UserView.class.getName());

    public void mosttradettagli(Utente user) {
        System.out.println("User: "
                + user.getUsername()
                + user.getPassword());
    }

    public void showRegistrationSuccess() {
        LOGGER.info("Utente registrato con sucesso");
    }
    
    public void showLoginSuccess() {
        LOGGER.info("Utente loggato con successo");
    }
    
    public void showLoginFail() {
        LOGGER.warning("Attenzione credenziali non corrette o utente non registrato");
    }

}
