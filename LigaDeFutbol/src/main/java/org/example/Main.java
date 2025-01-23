package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Real Madrid", "Zidane", 0, null);
        Jugador jugador = new Jugador("Ronaldo", 35, "DELANTERO", 20);
        equipo.agregarJugador(jugador);

        String posicion = "MEDIOCENTRO";
        Jugador otroJugador = new Jugador("Bale", 30, posicion, 15);
        equipo.agregarJugador(otroJugador);

    }
}