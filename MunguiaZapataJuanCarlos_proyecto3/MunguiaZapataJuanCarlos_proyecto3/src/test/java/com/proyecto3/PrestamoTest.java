package com.proyecto3;


import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PrestamoTest {

	@Test
	void testObtenerDiasDePrestamo() {
		Biblioteca biblioteca = new Biblioteca();

		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
        Usuario usuario1 = new Usuario(123456789, "Paco");
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarUsuario(usuario1);
        
		LocalDate inicio = LocalDate.now();
	    LocalDate fin = inicio.plusDays(20);
	    Prestamo prestamo = new Prestamo(libro1, usuario1, inicio, fin);
	    assertEquals(20, prestamo.obtenerDiasDePrestamo());
		
	}

	@Test
	void testEstaFueraDeFecha() {
		Biblioteca biblioteca = new Biblioteca();

		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
        Usuario usuario1 = new Usuario(123456789, "Pepe");
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarUsuario(usuario1);
        
        LocalDate inicio = LocalDate.now().minusDays(30);
	    LocalDate fin = inicio.plusDays(20);
	    Prestamo prestamo = new Prestamo(libro1, usuario1, inicio, fin);
        assertEquals(true, prestamo.estaFueraDeFecha());
	}

}
