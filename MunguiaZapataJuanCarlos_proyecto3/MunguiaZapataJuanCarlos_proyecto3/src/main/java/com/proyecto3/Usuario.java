package com.proyecto3;

public class Usuario {
    private int dni;
    private String nombre;
    private boolean haReservado;

    public Usuario(int dni, String nombre) {
        if (String.valueOf(dni).length() == 9) {
            this.dni = dni;
            this.nombre = nombre;
        } else {
            System.out.println("El DNI debe tener 9 caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getDni() { 
    	return dni; 
   	}
    
    public String getNombre() { 
    	return nombre; 
    }
    
    public boolean getHaReservado() {
    	return haReservado;
    }
    
    public void setHaReservado(boolean haReservado) {
		this.haReservado = haReservado;
	}
}
