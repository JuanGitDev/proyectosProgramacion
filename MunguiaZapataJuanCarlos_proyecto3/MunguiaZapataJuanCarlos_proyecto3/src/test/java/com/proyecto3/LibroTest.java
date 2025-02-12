package com.proyecto3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroTest {

	@Test
	void testMarcarComoPrestado() {
		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
		
		libro1.marcarComoPrestado();
		
		assertEquals(false, libro1.isDisponibilidad());
	}

	@Test
	void testMarcarComoDevuelto() {
		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true);
		
		libro1.marcarComoPrestado();
		
		assertEquals(false, libro1.isDisponibilidad());
		
		libro1.marcarComoDevuelto();
		
		assertEquals(true, libro1.isDisponibilidad());
	}

}
