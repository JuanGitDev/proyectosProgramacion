package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autor Autor1 = new Autor();
        Autor1.Nombre = "Pepe Grillo";
        Autor1.Nacionalidad = "Peruano";

        Autor Autor2 = new Autor();
        Autor2.Nombre = "Pablo";
        Autor2.Nacionalidad = "Español";

        Libro Libro1 = new Libro();
        Libro1.Titulo = "La noche es oscura";
        Libro1.NumeroPaginas = 250;
        Libro1.Autor = Autor1.Nombre;

        Libro Libro2 = new Libro();
        Libro2.Titulo = "El dia es claro";
        Libro2.NumeroPaginas = 500;
        Libro2.Autor = Autor2.Nombre;

        Libro Libro3 = new Libro();
        Libro3.Titulo = "El agua Moja";
        Libro3.NumeroPaginas = 1000;
        Libro3.Autor = Autor2.Nombre;

        Libro libro = new Libro();
        System.out.println(libro);

    }
}