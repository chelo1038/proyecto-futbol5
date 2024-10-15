/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.futbol5;

import javax.swing.JOptionPane;


public class MostrarJugadores {
   
    
    int ID ; //0
    String nombre; //null
    String posicion; //null
    String equipo; //null
    String estado;
    int goles; //vacio
    boolean activo; //false
    
    public void mostrarDetalles(){
        String  actividad;
       
        if (activo) {
            actividad = "activo";
        } else {
             actividad = "Inactivo";
        }
        
        JOptionPane.showMessageDialog(null, "DATOS DEL JUGADOR: " +nombre  
                + "\nNOMBRE: " + nombre
                + "\nPOSICION: " + posicion
                + "\nEQUIPO: " + equipo 
                + "\nGoles: " + goles
                + "\nESTADO: " + activo );
        
    }
    
}
