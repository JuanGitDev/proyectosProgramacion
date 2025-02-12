package com.proyecto3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class BibliotecaTest {

	@Test
	void testAgregarLibro() {
		Biblioteca biblioteca = new Biblioteca();

		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
        biblioteca.agregarLibro(libro1);
        
        assertEquals(1, biblioteca.getLibros().size());
	}

	@Test
	void testAgregarUsuario() {
		 Biblioteca biblioteca = new Biblioteca();
		 
	     Usuario usuario1 = new Usuario(123456789, "Juan");
	     biblioteca.agregarUsuario(usuario1);
	     
	     assertEquals(1, biblioteca.getUsuarios().size());
	}

	@Test
	void testRealizarPrestamo() {
		 Biblioteca biblioteca = new Biblioteca();
		 
		 Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
		 biblioteca.agregarLibro(libro1);
		 
		 Usuario usuario1 = new Usuario(123456789, "Pepito Grillo");
		 biblioteca.agregarUsuario(usuario1);
		 
		 biblioteca.realizarPrestamo(libro1, usuario1, LocalDate.now().plusDays(10));
		 
		 assertEquals(1, biblioteca.getPrestamos().size());
	
	}

	@Test
	void testDevolverLibro() {
		Biblioteca biblioteca = new Biblioteca();
		 
		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
		biblioteca.agregarLibro(libro1);
		 
		Usuario usuario1 = new Usuario(123456789, "Pepito Grillo");
		biblioteca.agregarUsuario(usuario1);
		 
		biblioteca.realizarPrestamo(libro1, usuario1, LocalDate.now().plusDays(10));
		 
		assertEquals(1, biblioteca.getPrestamos().size());
		
		biblioteca.devolverLibro(libro1);
		
		assertEquals(0, biblioteca.getPrestamos().size());
	}

}
