package org.example;

import java.util.Random;

public enum Color {
    ROJO, AMARILLO, AZUL, VERDE, MORADO, ROSADO, NEGRO, BLANCO, GRIS;

    public static Color getRandomColor(){
        return values()[new Random().nextInt(values().length)];
    }
}
