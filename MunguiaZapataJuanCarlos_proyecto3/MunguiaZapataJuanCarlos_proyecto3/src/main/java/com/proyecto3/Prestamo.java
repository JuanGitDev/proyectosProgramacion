package com.proyecto3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaDeInicioPrestamo;
    private LocalDate fechaDeFinPrestamo;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaDeInicioPrestamo, LocalDate fechaDeFinPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaDeInicioPrestamo = fechaDeInicioPrestamo;

        if (fechaDeFinPrestamo.isBefore(fechaDeInicioPrestamo)) {
            this.fechaDeFinPrestamo = fechaDeInicioPrestamo.plusDays(15);
        } else if (fechaDeFinPrestamo.isAfter(fechaDeInicioPrestamo.plusDays(30))) {
            this.fechaDeFinPrestamo = fechaDeInicioPrestamo.plusDays(30);
        } else {
            this.fechaDeFinPrestamo = fechaDeFinPrestamo;
        }
    }

    public long obtenerDiasDePrestamo() {
        return ChronoUnit.DAYS.between(fechaDeInicioPrestamo, fechaDeFinPrestamo);
    }

    public boolean estaFueraDeFecha() {
        return LocalDate.now().isAfter(fechaDeFinPrestamo);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "usuario=" + usuario +
                ", libro=" + libro +
                ", fechaDeInicioPrestamo=" + fechaDeInicioPrestamo +
                ", fechaDeFinPrestamo=" + fechaDeFinPrestamo +
                '}';
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaDeInicioPrestamo() {
        return fechaDeInicioPrestamo;
    }

    public void setFechaDeInicioPrestamo(LocalDate fechaDeInicioPrestamo) {
        this.fechaDeInicioPrestamo = fechaDeInicioPrestamo;
    }

    public LocalDate getFechaDeFinPrestamo() {
        return fechaDeFinPrestamo;
    }

    public void setFechaDeFinPrestamo(LocalDate fechaDeFinPrestamo) {
        this.fechaDeFinPrestamo = fechaDeFinPrestamo;
    }
}
