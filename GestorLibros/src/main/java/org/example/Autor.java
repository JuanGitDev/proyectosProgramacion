package org.example;

public class Autor {
    public String Nombre;
    public String Nacionalidad;

    @Override
    public String toString(){
        return "El nombre es: " + Nombre + "\n Nacionalidad: " + Nacionalidad;
    }
}
