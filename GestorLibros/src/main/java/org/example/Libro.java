package org.example;

public class Libro {

    public String Titulo;
    public int NumeroPaginas;
    public String Autor;

    public Libro(String titulo, int numeroPaginas, String autor){
        this.Titulo = titulo;
        this.NumeroPaginas = numeroPaginas;
        this.Autor = autor;
    }

    public Libro() {

    }

    public void cambiarTitulo(String nuevoTitulo){
         Titulo = nuevoTitulo;
        System.out.println("El nombre se a cambiado correctamente a: " + Titulo);
    }
    public void cambiarNumeroDePaginas(int nuevoNumeroDePaginas){
        NumeroPaginas = nuevoNumeroDePaginas;
        System.out.println("Se a actualizado correctamente el numero de paginas a: " + NumeroPaginas);
    }
    @Override
    public String toString() {
        return "Nombre del libro: " + Titulo + "\n Número de páginas: " + NumeroPaginas + "\n Nombre del autor: " + Autor;
    }
}
