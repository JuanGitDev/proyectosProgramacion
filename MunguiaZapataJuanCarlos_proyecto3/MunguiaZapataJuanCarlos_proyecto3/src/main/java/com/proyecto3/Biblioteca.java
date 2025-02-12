package com.proyecto3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Reserva> reserva;
    private double cuenta;
    private int numeroPrestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getDni() == usuario.getDni()) {
                System.out.println("El usuario ya existe.");
                return;
            }
        }
        usuarios.add(usuario);
        System.out.println("Usuario agregado.");
    }

    public void realizarPrestamo(Libro libro, Usuario usuario, LocalDate fechaFin) {
        if (!libros.contains(libro) || !usuarios.contains(usuario)) {
            System.out.println("El usuario o el libro no están registrados en la biblioteca.");
            return;
        }

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) || libro.getReserva() == false) {
                System.out.println("El libro ya está prestado o reservado.");
                return;
            }
        }

        Prestamo prestamo = new Prestamo(libro, usuario, LocalDate.now(), fechaFin);
        double dias = ChronoUnit.DAYS.between(LocalDate.now(), fechaFin);
        double precioAPagar = libro.getPrecio() * dias;
        
        prestamos.add(prestamo);
        libro.marcarComoPrestado();
        
        System.out.println("Préstamo realizado, la cantidad a pagar es: " + precioAPagar);
        numeroPrestamos++;
        cuenta = precioAPagar + cuenta;
    }
    
    public void reservarLibro(Libro libro, Usuario usuario) {
    	if (!libros.contains(libro) || !usuarios.contains(usuario)) {
            System.out.println("El usuario o el libro no están registrados en la biblioteca.");
            return;
        }

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) || libro.getReserva() == false) {
                System.out.println("El libro ya está prestado o reservado.");
                return;
            }
        }
        
        if (usuario.getHaReservado() == true) {
			System.out.println("No puede reservar más de un libro a la vez");
		}else {
			Reserva reserva1 = new Reserva(libro, usuario);
			double precioAPagar = 1.00;
			reserva.add(reserva1);
			cuenta = precioAPagar + cuenta;
			usuario.setHaReservado(true);
		}
    }

    public void devolverLibro(Libro libro) {
        Prestamo prestamoADevolver = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro)) {
                prestamoADevolver = prestamo;
                break;
            }
        }

        if (prestamoADevolver != null) {
        	
        	if(libro.getReserva() == false) {
        		prestamos.remove(prestamoADevolver);
        		libro.marcarComoDevuelto(); 
        		System.out.println("Libro devuelto: " + libro.getTitulo());        		
        	}else {
        		for(Reserva reserva1 : reserva) {
        			if(reserva1.getLibro() == prestamoADevolver.getLibro()) {
        				Usuario usuarioReserva = reserva1.getUsuario();
        				Libro libroReserva = reserva1.getLibro();
        				realizarPrestamo(libro, usuarioReserva, LocalDate.now().plusDays(15));
        				System.out.println("El libro a pasado a ser prestado a la reserva");
        				usuarioReserva.setHaReservado(false);
        			}
        		}
        	}
        	
        } else {
            System.out.println("Error: El libro no está prestado.");
        }
    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarLibroPorGenero(String genero) {
        for (Libro libro : libros) {
            if (libro.getGenero() == GeneroLibro.valueOf(genero)) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarLibroPorID(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarPrestamosPorUsuario(int dni) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().getDni() == dni) {
                System.out.println(prestamo);
            }
        }
    }

    public void mostrarPrestamosCaducados(){
        for (Prestamo prestamo : prestamos) {
            if (prestamo.estaFueraDeFecha()) {
                System.out.println(prestamo);
            }
        }
    }
    
    public void mostrarReservas() {
    	for(Reserva reserva1 : reserva) {
    		System.out.println("Libro Reservado: " + reserva1.getLibro() + "\n Usuario que reserva: " + reserva1.getUsuario());
    	}
    }
    
    public ArrayList<Libro> getLibros() {
		return libros;
	}
    
    public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
    
    public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
    
    public ArrayList<Reserva> getReserva() {
		return reserva;
	}
    
    public double getCuenta() {
		return cuenta;
	}
    
    public int getNumeroPrestamos() {
		return numeroPrestamos;
	}
}
