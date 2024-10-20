package com.mycompany.proyectofinalfutbol5;

import javax.swing.JOptionPane;

public class Jugadores {

    public static void gestion_jugadores() {
        //String jugador= JOptionPane.showInputDialog("ingrese el nombre del jugador  ");
        // JOptionPane.showMessageDialog(null,"el jugador: " + jugador + ", fue añadido con exito");
        boolean varGestion = true;
        while (varGestion) {

            int codigo1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "⚽Bienvenido al gestor de jugadores ⚽:\n"
                    + "_________________________________________________\n"
                    + " 1- Mostrar jugadores. 🏃\n"
                    + "2- Agregar nuevo jugador. ⚙\n"
                    + "3- Editar jugador. 🏃🏼‍\n"
                    + "4- Eliminar jugador. ⚠\n"
                    + "5- Volver al menu. 🔚"));

            switch (codigo1) {
                case 1:
                    

                    break;
                case 2:
                    // se deberan almacenar los jugadores en listas
                    MostrarJugadores nuevoJugador = new MostrarJugadores();
                    nuevoJugador.ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del jugador: "));
                    nuevoJugador.nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
                    nuevoJugador.posicion = JOptionPane.showInputDialog("Ingrese la posición del jugador: ");
                    nuevoJugador.equipo = JOptionPane.showInputDialog("Ingrese el equipo del jugador: ");
                    nuevoJugador.estado = JOptionPane.showInputDialog("Ingrese el estado del jugador (Titular/Suplente): ");
                    nuevoJugador.goles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de goles: "));
                    nuevoJugador.activo = JOptionPane.showConfirmDialog(null, "¿Está activo?") == JOptionPane.YES_OPTION;
                    // mostrando el jugador que se acaba de añadir
                    JOptionPane.showMessageDialog(null, "El jugador " + nuevoJugador.nombre + ", en la posicion " + nuevoJugador.posicion + " ha sido añadido con éxito.");
                    nuevoJugador.mostrarDetalles();
                    JOptionPane.showMessageDialog(null,"para editar el jugador visitar la opcion de 3- Editar jugador. 🏃🏼‍");

                case 3:
                    // falta ver listas
                    break;

                case 4:
                    //falta ver listas
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "volviendo al menu principal  ");
                    varGestion = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "numero incorrecto, intente nuevamente ");

            }

        }

    }
}
