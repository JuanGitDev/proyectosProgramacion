package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Color[] colores = Color.values();

        for (int ronda = 0;ronda < 10; ronda++ ){
            System.out.println("Ronda " + (ronda + 1) + ":");

            List<Color> secuenciaAleatoria = new ArrayList<>(Arrays.asList(colores));
            Collections.shuffle(secuenciaAleatoria);

            System.out.println("Secuencia aleatoria:");
            for (Color color : secuenciaAleatoria) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }
}