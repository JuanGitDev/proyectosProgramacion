package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FechaProyecto {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaProrroga;

    public FechaProyecto(String nombre, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        actualizarFechas();
    }

    public void actualizarFechas(){
        this.fechaVencimiento = fechaInicio.plusDays(30);
        this.fechaRecordatorio = fechaVencimiento.minusDays(15);
        this.fechaProrroga = fechaVencimiento.plusDays(10);
        System.out.println("fecha guardada correctamente");
    }

   public void estado(){
        System.out.println(nombre + "\n fecha de inicio del proyecto: "
                + fechaInicio + "\n fecha de vencimiento del proyecto "
                + fechaVencimiento + "\n fecha de prorroga "
                + fechaProrroga + "\n fecha de recordatorio " + fechaRecordatorio);

        System.out.println("----------------------------");
        System.out.println("Faltan " + ChronoUnit.DAYS.between(fechaInicio, fechaVencimiento) + " Dias para terminar :)");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
        actualizarFechas();
    }
}
