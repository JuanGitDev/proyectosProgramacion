package com.proyecto3;

public class Libro {
    private static int contadorId = 1;
    private int id;
    private String titulo;
    private String nombreAutor;
    private GeneroLibro genero;
    private boolean disponibilidad;
    private boolean reserva;
    private double precio;

    public Libro(String titulo, String nombreAutor, GeneroLibro genero, boolean disponibilidad, double precio) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.genero = genero;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public void marcarComoPrestado() {
        this.disponibilidad = false;
        System.out.println("El libro ha sido prestado.");
    }

    public void marcarComoReservado() {
    	this.reserva = true;
    	System.out.println("El libro ha sido reservado.");
    }
    
    public void marcarComoDevuelto() {
    	
    	if(reserva == false) {
    		this.disponibilidad = false;
    		System.out.println("El libro a sido prestado a la persona que lo reservó");
    	}else {
    		this.disponibilidad = true;
    		System.out.println("El libro ha sido devuelto.");    		
    	}
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", genero=" + genero +
                ", disponibilidad=" + (disponibilidad ? "Disponible" : "No disponible") +
                '}';
    }

    public int getId() { 
        return id; 
    }

    public String getTitulo() { 
        return titulo; 
    }

    public GeneroLibro getGenero() { 
        return genero; 
    }

    public boolean isDisponible() { 
        return disponibilidad; 
    }

    public static int getContadorId() {
        return contadorId;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    
    public double getPrecio() {
		return precio;
	}
    
    public boolean getReserva() {
    	return reserva;
    }
}
