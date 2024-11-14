package com.mycompany.proyectofinalfutbol5;

import javax.swing.JOptionPane;

public class GestionJugadores {

    public static void gestionJugadores() {
        //String jugador= JOptionPane.showInputDialog("ingrese el nombre del jugador  ");
        // JOptionPane.showMessageDialog(null,"el jugador: " + jugador + ", fue añadido con exito");
        boolean jugadorGestion = true;
        while (jugadorGestion) {

            int codigo1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "╔══════════════ Gestión de Jugadores ═════════════════╗\n"
                    + "       1- Mostrar jugadores. 🏃🏃\n"
                    + "       2- Agregar nuevo jugador. +🏃\n"
                    + "       3- Editar jugador. 🏃🏼‍\n"
                    + "       4- Eliminar jugador. ⚠\n"
                    + "       5- Volver al menu. 🔚\n"
                    + "╚═══════════════════════════════════════════════════╝"));

            switch (codigo1) {
                case 1:
                    // faltan ver arreglos 

                    break;
                case 2:
                    // se deberan almacenar los jugadores en listas
                    Jugadores nuevoJugador = new Jugadores();
                    nuevoJugador.ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del jugador: "));
                    nuevoJugador.nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
                    nuevoJugador.posicion = JOptionPane.showInputDialog("Ingrese la posición del jugador: ");
                    nuevoJugador.equipo = JOptionPane.showInputDialog("Ingrese el equipo del jugador: ");
                    String Titular = "¿El jugador es Titular o Suplente?";
                    String[] opcionesTitular = {"Titular", "Suplente"};
                    int seleccion = JOptionPane.showOptionDialog(
                            null,
                            Titular,
                            "Estado del Jugador",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcionesTitular,
                            opcionesTitular[0]);
                    if (seleccion == 0) {
                        nuevoJugador.estado = "Titular";
                    } else if (seleccion == 1) {
                        nuevoJugador.estado = "Suplente";
                    }
                    nuevoJugador.activo = JOptionPane.showConfirmDialog(null, "¿Está activo?") == JOptionPane.YES_OPTION;
                    JOptionPane.showMessageDialog(null, "El jugador " + nuevoJugador.nombre + ", en la posicion " + nuevoJugador.posicion + ", ha sido añadido con éxito.");
                    nuevoJugador.mostrarDetalles();
                    JOptionPane.showMessageDialog(null, "para editar el jugador recien agregado, visitar la opcion 3- Editar jugador. 🏃🏼‍");

                case 3:
                    // faltan ver arreglos 
                    break;

                case 4:
                    // faltan ver arreglos 
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "volviendo al menu principal  ");
                    jugadorGestion = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "numero incorrecto, intente nuevamente ");

            }

        }

    }
}
