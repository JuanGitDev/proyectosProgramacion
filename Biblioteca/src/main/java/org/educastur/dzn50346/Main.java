package org.educastur.dzn50346;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", "Ficción", 5);
        System.out.println(libro.getTitulo());
        System.out.println(libro);
    }
}