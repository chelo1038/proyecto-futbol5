
package com.mycompany.proyectofinalfutbol5;
import javax.swing.JOptionPane;

public class Equipo {

    public static void gestionEquipos() {
        boolean equipoGestion = true;
        while (equipoGestion) {

            int manuEquipo = Integer.parseInt(JOptionPane.showInputDialog(
                    "╔══════════════ Gestión de Equipos ═════════════════╗\n"
                    + "      1- Mostrar Equipos. \n"
                    + "      2- Agregar Equipo.\n"
                    + "      3- Agregar Jugador a un Equipo. \n"
                    + "      4- Eliminar Jugador de un Equipo. \n"
                    + "      5- Volver al menu. 🔚\n"
                    + "╚═════════════════════════════════════════════════╝"));
            switch (manuEquipo) {
                case 1:
                    // faltan ver arreglos 

                    break;
                case 2:
                    MostrarEquipos nuevoEquipo = new MostrarEquipos();
                    nuevoEquipo.IdEquipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del equipo "));
                    nuevoEquipo.nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo ");
                    
                    // no agregue los demas por que inician en 0
                    
                    JOptionPane.showInputDialog(null, "el equipo " + nuevoEquipo.nombreEquipo + " con el ID " + nuevoEquipo.IdEquipo + " se agrego con exito");
                    break;
                case 3:
                    // faltan ver arreglos 
                    break;

                case 4:
                    // faltan ver arreglos 
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "volviendo al menu principal  ");
                    equipoGestion = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "numero incorrecto, intente nuevamente ");

            }

        }

    }

}


