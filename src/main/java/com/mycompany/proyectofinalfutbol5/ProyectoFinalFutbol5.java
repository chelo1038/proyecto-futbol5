
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

           String mensaje = "selecione una opcion";
                  
//⚽bienvenido al gestor de Partidos de Fútbol Cinco⚽\n"
//                    + "   1- Gestion de jugadores🏃\n"
//                    + "   2- Gestión de Equipos.🏃🏃\n"
//                    + "   3- Simulación de Partidos. 🏃🏼‍🏃\n"
//                    + "   4- Reportes. ⚠\n"
//                    + "   5- Salir del Sistema. 🔚\n";
            String[] opciones = {
                "1- Gestión de jugadores🏃",
                "2- Gestión de Equipos🏃🏃",
                "3- Simulación de Partidos🏃🏼‍🏃",
                "4- Reportes⚠",
                "5- Salir 🔚"
            };
            int codigo = JOptionPane.showOptionDialog(
                    null,
                    mensaje,
                    "Gestor de Partidos de Fútbol Cinco⚽",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[3]);

            switch (codigo) {
                case 0:
                    Jugadores.gestionJugadores();
                    break;
                case 1:
                    Equipo.gestionEquipos();

                    break;
                case 2:

                    for (int i = 0; i < 5; i++) {
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
                    JOptionPane.showMessageDialog(null, "si desea salir selecione la opcion,  5- Salir 🔚");

            }

        }
    }
}

        
// creo que esta mal 
//        MostrarJugadores jugador1Equipo1 = new MostrarJugadores();
//
//        jugador1Equipo1.ID = 123654789;
//        jugador1Equipo1.nombre = "Andres Perez";
//        jugador1Equipo1.posicion = "Delantero";
//        jugador1Equipo1.equipo = "LDA";
//        jugador1Equipo1.estado = "Titular";
//        jugador1Equipo1.activo = true;
//        jugador1Equipo1.goles = 0;
//
//        jugador1Equipo1.mostrarDetalles();
        
 
    

   
    

//JOptionPane.ERROR_MESSAGE:           Muestra un ícono de error.
//JOptionPane.INFORMATION_MESSAGE:     Muestra un ícono de información.
//JOptionPane.WARNING_MESSAGE:         Muestra un ícono de advertencia.
//JOptionPane.QUESTION_MESSAGE:        Muestra el ícono de pregunta que ya has estado viendo.