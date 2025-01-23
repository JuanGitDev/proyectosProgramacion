package org.example;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del proyecto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de inicio del proyecto (formato: yyyy-MM-dd): ");
        String fechaInicioStr = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

        FechaProyecto proyecto = new FechaProyecto(nombre, fechaInicio);

        proyecto.estado();

        proyecto.setFechaInicio(LocalDate.of(2026, 12, 1));
        proyecto.estado();

        scanner.close();
    }
}