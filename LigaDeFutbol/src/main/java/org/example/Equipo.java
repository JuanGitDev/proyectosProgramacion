package org.example;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String nombreEntrenador;
    private ArrayList<Jugador> jugadores;
    private int totalGolesDelEquipo;

    public Equipo(String nombreEquipo, String nombreEntrenador, int totalGolesDelEquipo, Jugador jugador) {
        this.nombreEquipo = nombreEquipo;
        this.nombreEntrenador = nombreEntrenador;
        this.totalGolesDelEquipo = totalGolesDelEquipo;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        totalGolesDelEquipo += jugador.getGoles();

        System.out.println("Nombre: " + jugador.getNombreJugador() +
                ", Edad: " + jugador.getEdadJugador() +
                ", Posición: " + jugador.getPosicion() +
                ", Goles: " + jugador.getGoles());

    }

    public int golesDelEquipo() {
        totalGolesDelEquipo = 0;
        for (Jugador jugador : jugadores) {
            totalGolesDelEquipo += jugador.getGoles();
        }
        return totalGolesDelEquipo;
    }

    public void mostrarJugadores() {
        System.out.println("Jugadores de " + nombreEquipo + ":");
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en este equipo.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println("Nombre: " + jugador.getNombreJugador() +
                        ", Edad: " + jugador.getEdadJugador() +
                        ", Posición: " + jugador.getPosicion() +
                        ", Goles: " + jugador.getGoles());
            }
        }
    }

    public boolean borrarJugador(String nombreJugador) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombreJugador().equalsIgnoreCase(nombreJugador)) {
                jugadores.remove(jugador);
                System.out.println("Jugador " + nombreJugador + " ha sido eliminado.");
                return true; // Retorna true cuando el jugador es encontrado y eliminado
            }
        }
        System.out.println("No se encontró al jugador " + nombreJugador + ".");
        return false; // Retorna false si no se encuentra el jugador
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreEntrenador='" + nombreEntrenador + '\'' +
                ", jugadores=" + jugadores +
                ", totalGolesDelEquipo=" + totalGolesDelEquipo +
                '}';
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }


    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getTotalGolesDelEquipo() {
        return totalGolesDelEquipo;
    }
}
