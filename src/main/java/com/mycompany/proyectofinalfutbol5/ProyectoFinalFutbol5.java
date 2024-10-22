
package com.mycompany.proyectofinalfutbol5;


import javax.swing.JOptionPane;
// esto es lo que nos va a evaluar en el primer avance

//Semana 8: Primer Avance del Proyecto
//Para este avance (5% del total del proyecto), se solicita presentar:
//1- La definición básica de las clases y atributos relacionados con el proyecto incluye la estructura básica 
//de las clases principales del proyecto con sus atributos y métodos sencillos.

//2- La implementación de estructuras de navegación para todas las secciones del código los menús y 
//submenús y botones que compone toda la navegación del proyecto.

//3- Una versión preliminar del sistema que incluya la creación y gestión básica de jugadores y equipos.


public class ProyectoFinalFutbol5 {

    public static void main(String[] args) {
        boolean ejecutar = true;
        while (ejecutar) {

            int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                    "⚽bienvenido al gestor de Partidos de Fútbol Cinco⚽:\n"
                    + "_________________________________________________\n"
                    + "1- Gestion de jugadores🏃\n"
                    + "2- Gestión de Equipos. ⚙\n"
                    + "3- Simulación de Partidos. 🏃🏼‍\n"
                    + "4- Reportes. ⚠\n"
                    + "5- Salir del Sistema. 🔚"));

            switch (codigo) {
                case 1:
                    Jugadores.gestion_jugadores();
                    break;
                case 2:
                    Equipo.gestionEquipos();

                    break;
                case 3:

                    for (int i = 0; i < 5; i++) {
                        JOptionPane.showMessageDialog(null,
                                "simulacion de 40 jugadas.");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,
                            "reportes");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "saliendo del sistema, hasta luego! ");
                    ejecutar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "numero incorrecto, intente nuevamente ");

            }
        }

        MostrarJugadores jugador1Equipo1 = new MostrarJugadores();

        jugador1Equipo1.ID = 123654789;
        jugador1Equipo1.nombre = "Andres Perez";
        jugador1Equipo1.posicion = "Delantero";
        jugador1Equipo1.equipo = "Saprissa";
        jugador1Equipo1.estado = "Titular";
        jugador1Equipo1.activo = true;
        jugador1Equipo1.goles = 0;

        jugador1Equipo1.mostrarDetalles();

    }

    private static void gestion_jugadores() {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
