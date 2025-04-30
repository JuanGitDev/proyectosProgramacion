package org.educastur.dzn50346;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
        cargaDatos();
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cargaDatos();
        biblioteca.listados();
    }
    public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3));
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3));
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4));
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3));
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2));
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2));
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",0));
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Novela Negra",3));
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",0
        ));

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111"));
        usuarios.add(new Usuario("22","David","david@email.com","622222222"));
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333"));
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444"));
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555"));
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));

        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(4), hoy,hoy.plusDays(2)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(1), hoy,hoy.plusDays(5)));
    }

    //Menus
    public void menu(){
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tBIBLIOTECA\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menuLibros();
                    break;
                }
                case 2:{
                    menuUsuarios();
                    break;
                }
                case 3:{
                    menuPrestamos();
                    break;
                }
            }
        }while (opcion != 9);
    }

    private void menuLibros() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tLIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }
                case 2:{
                    eliminarLibro();
                    break;
                }
                case 3:{
                    modificarLibros();
                    break;
                }
                case 4:{
                    listaLibros();
                    break;
                }
            }
        }while (opcion != 9);
    }

    private void menuUsuarios() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tUSUARIOS");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }
                case 2:{
                    eliminarUsuario();
                    break;
                }
                case 3:{
                    modificarUsuario();
                    break;
                }
                case 4:{
                    listaUsuarios();
                    break;
                }
            }
        }while (opcion != 9);
    }

    private void menuPrestamos() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tPRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t3 - PRORROGAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADO GENERAL PRESTAMOS");
            System.out.println("\t\t\t\t5 - LISTADO PRESTAMOS USUARIO");
            System.out.println("\t\t\t\t6 - LISTADO PRESTAMOS LIBRO (USUARIOS QUE LO LEEN)");
            System.out.println("\t\t\t\t7 - LIBRO MAS LEIDO");
            System.out.println("\t\t\t\t8 - USUARIO MAS LECTOR");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }
                case 2:{
                    devolucion();
                    break;
                }
                case 3:{
                    prorroga();
                    break;
                }
                case 4:{
                    listaPrestamos();
                    break;
                }
                case 5:{
                    listaPrestamosUsu();
                    break;
                }
                case 6:{
                    listaPrestamosLibro();
                    break;
                }
                case 7:{
                    libroMasLeido();
                    break;
                }
                case 8:{
                    usuarioMasLector();
                    break;
                }
            }
        }while (opcion != 9);
    }

    //Prestamos
    public void nuevoPrestamo(){
        Scanner sc=new Scanner(System.in);
        String dni;
        String isbn;
        int posDni, posIsbn;
        LocalDate hoy=LocalDate.now();
        System.out.println("Teclea tu DNI:");
        dni=sc.next();
        posDni=buscaDni(dni);
        if (posDni==-1){
            System.out.println("Ese DNI no es usuario de la Biblioteca");
        }else {
            System.out.println("Teclea el ISBN del libro:");
            isbn=sc.next();
            posIsbn=buscaIsbn(isbn);
            if (posIsbn==-1){
                System.out.println("Ese libro no está disponible");
            }else{
                prestamos.add(new Prestamo(libros.get(posIsbn),usuarios.get(posDni)
                        ,hoy,hoy.plusDays(15)));
                libros.get(posIsbn).setEjemplares(libros.get(posIsbn).getEjemplares()-1);
            }
        }
    }

    //busquedas
    public int buscaDni(String dni){
        for (int i=0; i<usuarios.size(); i++){
            if (usuarios.get(i).getDni().equals(dni)){
                return i;
            }
        }
        return -1;
    }

    public int buscaIsbn(String isbn){
        for (int i=0; i<libros.size(); i++){
            if (libros.get(i).getIsbn().equals(isbn)){
                return i;
            }
        }
        return -1;
    }

    //Listados
    public void listados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Listado de libros");
        System.out.println("2. Listado de usuarios");
        System.out.println("3. Listado de prestamos");
        System.out.println("4. Listado por generos");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                for (Libro libro : libros) {
                    System.out.println(libro);
                }
                break;
            case 2:
                for (Usuario usuario : usuarios) {
                    System.out.println(usuario);
                }
                break;
            case 3:
                for (Prestamo prestamo : prestamos) {
                    System.out.println(prestamo);
                }
                break;
            case 4:
                listadosPorGenero();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public void listadosPorGenero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el genero:");
        String genero = sc.nextLine();
//        for (Libro libro : libros) {
//            if (libro.getGenero().equalsIgnoreCase(genero)) {
//                System.out.println(libro);
//            }
//        }

        libros.stream().filter(libro -> libro.getGenero().equalsIgnoreCase(genero)).forEach(System.out::println);
    }

    //Libros
    public void nuevoLibro(){
        Scanner sc=new Scanner(System.in);
        String isbn;
        String titulo;
        String autor;
        String genero;
        int ejemplares;
        System.out.println("Teclea el ISBN del libro:");
        isbn=sc.next();
        System.out.println("Teclea el Titulo del libro:");
        titulo=sc.next();
        System.out.println("Teclea el Autor del libro:");
        autor=sc.next();
        System.out.println("Teclea el Genero del libro:");
        genero=sc.next();
        System.out.println("Teclea el numero de ejemplares del libro:");
        ejemplares=sc.nextInt();

        libros.add(new Libro(isbn,titulo,autor,genero,ejemplares));
    }

    public void eliminarLibro(){
        System.out.println("Teclea el ISBN del libro a eliminar:");
        Scanner sc=new Scanner(System.in);
        String isbn=sc.next();
        int pos=buscaIsbn(isbn);
        if (pos==-1){
            System.out.println("Ese libro no existe");
        }else{
            libros.remove(pos);
            System.out.println("Libro eliminado");
        }
    }

}
