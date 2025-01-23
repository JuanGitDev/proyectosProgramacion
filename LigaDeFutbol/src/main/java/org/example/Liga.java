package org.example;

import java.util.ArrayList;

public class Liga {
    private String nombreLiga = "LaLiga";
    private ArrayList<Equipo> equipos = new ArrayList<>();

    public void agregarEquipo(Equipo nombreEquipo){
        if (equipos.size() < 5){
            equipos.add(nombreEquipo);
            System.out.println("El equipo se a agregado");
        }else {
            System.out.println("No se pueden agregar mas equipos");
        }
    }

    @Override
    public String toString() {
        return "LaLiga{" +
                "equipos=" + equipos +
                '}';
    }

    public Equipo equipoConMasGoles(){
        if (equipos == null || equipos.isEmpty()) {
            return null;
        }

        Equipo equipoConMasGoles = equipos.get(0);
        for (Equipo equipo : equipos){
            if (equipo.golesDelEquipo() > equipoConMasGoles.golesDelEquipo()){
                equipoConMasGoles = equipo;
            }
        }
        return equipoConMasGoles;
    }

    public void mostrarJugadores() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos en la liga.");
        } else {
            for (Equipo equipo : equipos) {
                equipo.mostrarJugadores();
                System.out.println();
            }
        }
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
