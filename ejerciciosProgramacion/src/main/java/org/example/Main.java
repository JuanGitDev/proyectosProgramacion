package org.example;

import java.util.Scanner;

public class Main {
    public static int ultimoResultado = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        String op1 = null;
        String op2 = null;

        do {
            mostrarMenu();

            opcion = entrada.nextInt();

            switch (opcion) {
                //suma
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese el primer operando a sumar");
                    op1 = entrada.nextLine();


                    System.out.println("Ingrese el segundo operando a sumar");
                    op2 = entrada.nextLine();

                    sumar(op1,op2);

                    break;
                    //resta
                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese el primer operando a restar");
                    op1 = entrada.nextLine();

                    System.out.println("Ingrese el segundo operando a restar");
                    op2 = entrada.nextLine();

                    resta(op1, op2);
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("Ingrese el primer operando a multiplicar");
                    op1 = entrada.nextLine();

                    System.out.println("Ingrese el segundo operando a multiplicar");
                    op2 = entrada.nextLine();

                    multiplica(op1, op2);
                    break;
                case 4:
                    entrada.nextLine();
                    System.out.println("Ingrese el primer operando a dividir");
                    op1 = entrada.nextLine();

                    System.out.println("Ingrese el segundo operando a dividir");
                    op2 = entrada.nextLine();

                    divide(op1, op2);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("Fin del programa");
                    opcion = 8;
                    break;
                default:
                    System.out.print("Opcion no valida. ");
                    break;
            }
        } while (opcion != 8);

    }

    public static void mostrarMenu() {
        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
        System.out.println("");
    }

    // OPERACIONES CON 2 OPERANDOS
    public static void sumar(String operando1, String operando2) {
        if (esNumero(operando1) && esNumero(operando2)){
            if (operando1.contains(".") || operando2.contains(".")){
                double op1 = Double.parseDouble(operando1);
                double op2 = Double.parseDouble(operando2);

                sumar(op1,op2);
            }else {
                int op1 = Integer.parseInt(operando1);
                int op2 = Integer.parseInt(operando2);

                sumar(op1, op2);

            }
        }else {
            System.out.println("Solo se deben añadir números");

        }
    }

    public static void sumar(int operando1, int operando2) {
        int resultado = operando1 + operando2;
        System.out.println("el resultado es " + resultado);
    }

    public static void sumar(double operando1, double operando2) {
        double resultado = operando1 + operando2;
        System.out.println("el resultado es " + resultado);
    }
    // OPERACIONES CON 1 OPERANDO
    public void sumar(String operando1) {
        // Comprobar si
    }

    public void sumar(int operando1) {

    }

    //restas
    public static void resta(String operando1, String operando2){

        if (esNumero(operando1) && esNumero(operando2)){
            if (operando1.contains(".") || operando2.contains(".")){
                double op1 = Double.parseDouble(operando1);
                double op2 = Double.parseDouble(operando2);

                resta(op1,op2);
            }else {
                int op1 = Integer.parseInt(operando1);
                int op2 = Integer.parseInt(operando2);

                resta(op1, op2);

            }
        }else {
            System.out.println("Solo se deben añadir números");

        }
    }

    public static void resta(double op1, double op2){
        double resultado = op1 - op2;
        System.out.println("el resultado es " + resultado);
    }

    public static void resta(int op1, int op2){
        int resultado = op1 - op2;
        System.out.println("el resultado es " + resultado);
    }

    //multiplicacion
    public static void multiplica(String operando1, String operando2){

        if (esNumero(operando1) && esNumero(operando2)){
            if (operando1.contains(".") || operando2.contains(".")){
                double op1 = Double.parseDouble(operando1);
                double op2 = Double.parseDouble(operando2);

                resta(op1,op2);
            }else {
                int op1 = Integer.parseInt(operando1);
                int op2 = Integer.parseInt(operando2);

                resta(op1, op2);

            }
        }else {
            System.out.println("Solo se deben añadir números");

        }
    }

    public static void multiplica(double op1, double op2){
        double resultado = op1 * op2;
        System.out.println("el resultado es " + resultado);
    }

    public static void multiplica(int op1, int op2){
        int resultado = op1 * op2;
        System.out.println("el resultado es " + resultado);
    }

    //divide
    public static void divide(String operando1, String operando2){

        if (esNumero(operando1) && esNumero(operando2)){
            if (operando1.contains(".") || operando2.contains(".")){
                double op1 = Double.parseDouble(operando1);
                double op2 = Double.parseDouble(operando2);

                resta(op1,op2);
            }else {
                int op1 = Integer.parseInt(operando1);
                int op2 = Integer.parseInt(operando2);

                resta(op1, op2);

            }
        }else {
            System.out.println("Solo se deben añadir números");

        }
    }

    public static void divide(double op1, double op2){
        double resultado = op1 / op2;
        System.out.println("el resultado es " + resultado);
    }

    public static void divide(int op1, int op2){
        int resultado = op1 / op2;
        System.out.println("el resultado es " + resultado);
    }


    // Método para comprobar si un texto es un numero o no
    public static boolean esNumero(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }

        int puntos = 0; // Contador para puntos decimales
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == '.') {
                puntos++;
                if (puntos > 1) {
                    return false; // Más de un punto no es válido
                }
            } else if (c == '-' && i == 0) {
                continue; // Permitir signo negativo al inicio
            } else if (!Character.isDigit(c)) {
                return false; // No es dígito ni punto
            }
        }

        return true;
    }
}