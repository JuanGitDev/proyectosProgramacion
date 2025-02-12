package com.proyecto3;

public class Reserva {
	private Usuario usuario;
	private Libro libro;
	
	public Reserva(Libro libro, Usuario usuario) {
		this.libro = libro;
		this.usuario = usuario;
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

}
