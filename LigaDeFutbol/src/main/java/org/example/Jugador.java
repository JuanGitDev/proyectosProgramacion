package org.example;

public class Jugador {
    private String nombreJugador;
    private int edadJugador;
    private PosicionJugador.PosicionDeJugador posicion;
    private int goles;

    public Jugador(String nombreJugador, int edadJugador, String posicion, int goles) {
        this.nombreJugador = nombreJugador;
        this.edadJugador = edadJugador;
        this.posicion = PosicionJugador.PosicionDeJugador.valueOf(posicion);
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", edadJugador=" + edadJugador +
                ", posicion='" + posicion + '\'' +
                ", goles=" + goles +
                '}';
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdadJugador() {
        return edadJugador;
    }

    public void setEdadJugador(int edadJugador) {
        this.edadJugador = edadJugador;
    }

    public PosicionJugador.PosicionDeJugador getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = PosicionJugador.PosicionDeJugador.valueOf(posicion);
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
