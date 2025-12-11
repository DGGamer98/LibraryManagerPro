/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagerpro;

import com.mycompany.librarymanagerpro.model.Libro;
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
                .annoDiPubblicazione(1400)
                .disponibile(true)
                .build();
        
        System.out.println(libro);
    }
}
