package com.mycompany.proyecto.futbol5;

import javax.swing.JOptionPane;


public class Jugadores {
        public static void gestion_jugadores(){
        String jugador= JOptionPane.showInputDialog("ingrese el nombre del jugador  ");
        JOptionPane.showMessageDialog(null,"el jugador: " + jugador + ", fue añadido con exito");
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                "⚽Bienvenido al gestor de jugadores ⚽:\n"
                +"_________________________________________________\n"
                +" 1- Mostrar jugadores. 🏃\n"                       
                + "2- Agregar nuevo jugador. ⚙\n"
                + "3- Editar jugador. 🏃🏼‍\n"
                + "4- Eliminar jugador. ⚠\n"
                + "5- Volver al menu. 🔚"));
        
        
       
    }
    
}
