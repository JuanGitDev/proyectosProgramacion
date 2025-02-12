package com.proyecto3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", GeneroLibro.AVENTURA, true, 1.30);
        Libro libro2 = new Libro("1984", "George Orwell", GeneroLibro.CIENCIA_FICCION, true, 1.00);
        Libro libro3 = new Libro("La Casa de los Espíritus", "Isabel Allende", GeneroLibro.AVENTURA, true, 1.50);
        Libro libro4 = new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", GeneroLibro.INFANTIL, true, 2.30);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        Usuario usuario1 = new Usuario(12345678, "Juan");
        Usuario usuario2 = new Usuario(87654321, "Ana");

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        biblioteca.realizarPrestamo(libro1, usuario1, LocalDate.now().plusDays(10));
        biblioteca.realizarPrestamo(libro2, usuario2, LocalDate.now().plusDays(15));
        
        biblioteca.reservarLibro(libro1, usuario2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Menú Biblioteca ----");
            System.out.println("1. Mostrar libros disponibles");
            System.out.println("2. Mostrar libros por género");
            System.out.println("3. Mostrar libro por ID");
            System.out.println("4. Mostrar préstamos por usuario");
            System.out.println("5. Mostrar préstamos caducados");
            System.out.println("6. Mostrar el dinero recaudado y el numero de prestamos realizado");
            System.out.println("7. Mostrar las reservas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    biblioteca.mostrarLibrosDisponibles();
                    break;

                case 2:
                    System.out.print("Introduce el género (INFANTIL, AVENTURA, CIENCIA_FICCION): ");
                    String genero = scanner.nextLine().toUpperCase();
                    biblioteca.mostrarLibroPorGenero(genero);
                    break;

                case 3:
                    System.out.print("Introduce la ID del libro: ");
                    int id = scanner.nextInt();
                    biblioteca.mostrarLibroPorID(id);
                    break;

                case 4:               
                    System.out.print("Introduce el DNI del usuario: ");
                    int dni = scanner.nextInt();
                    biblioteca.mostrarPrestamosPorUsuario(dni);
                    break;

                case 5:
                    biblioteca.mostrarPrestamosCaducados();
                    break;
                    
                case 6:
                	System.out.println("El dinero recaudado a sido: " + biblioteca.getCuenta());
                	System.out.println("El numero se prestamos realizado a sido: " + biblioteca.getNumeroPrestamos());
                	break;
                	
                case 7:
                	biblioteca.mostrarReservas();
                	break;

                case 8:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
