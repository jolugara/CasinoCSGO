/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casinocsgo;

/**
 *
 * @author alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Interfaz ventana = new Interfaz();
        ventana.setSize(1100,500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("CasinoCSGO");
        ventana.setVisible(true);
    }
    
}
