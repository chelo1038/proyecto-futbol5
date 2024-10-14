/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.futbol5;

import static com.mycompany.proyecto.futbol5.Jugadores.gestion_jugadores;
import javax.swing.JOptionPane;

/**
 *
 * @author chelo
 */
public class ProyectoFutbol5 {
    

    public static void main(String[] args) {
             boolean ejecutar = true;
        while (ejecutar){
        
        
        
        
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                "⚽bienvenido al gestor de Partidos de Fútbol Cinco⚽:\n"
                +"_________________________________________________\n"
                +"1-Gestion de jugadores🏃\n"                       
                + "2- Gestión de Equipos. ⚙\n"
                + "3- Simulación de Partidos. 🏃🏼‍\n"
                + "4- Reportes. ⚠\n"
                + "5- Salir del Sistema. 🔚"));

        switch (codigo) {
            case 1:
                gestion_jugadores();
                break;
            case 2:
                for (int i = 0; i <5; i++ ){
                JOptionPane.showMessageDialog(null,
                        "simulacion de 40 jugadas.");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "reportes");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "saliendo del sistema, hasta luego! ");
                ejecutar = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "numero incorrecto");
                
                
        }
        }


        
        
        
        
        
        
        
        
    }
    
    
    
}

    

