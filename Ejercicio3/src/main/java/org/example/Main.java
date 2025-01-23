package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        ColoresSemaforo[] coloresPosibles = ColoresSemaforo.values();
        RespuestasPosibles[] respuestasPosibles = RespuestasPosibles.values();

        for (int i = 0; i < 10; i++){
            ColoresSemaforo colorAleatorio = coloresPosibles[r.nextInt(coloresPosibles.length)];

            for (int j = 0; j < coloresPosibles.length; j++) {
                System.out.println(i+1 + " "+ respuestasPosibles[i]);
            }
            int respuestaSeleccionada = scanner.nextInt();
            RespuestasPosibles respuesta = respuestasPosibles[respuestaSeleccionada];

            boolean respuestaCorrecta = true;
            switch (colorAleatorio){
                case ROJO -> {
                    if (respuesta.equals(RespuestasPosibles.PARAR)){
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                        respuestaCorrecta = false;
                    }
                }
                case AMARILLO -> {
                    if (respuesta.equals(RespuestasPosibles.CUIDADO)){
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                        respuestaCorrecta = false;
                    }
                }
                case VERDE -> {
                    if (respuesta.equals(RespuestasPosibles.AVANZAR)){
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                        respuestaCorrecta = false;
                    }
                }

            }
                if (respuestaCorrecta == false){
                    System.out.println("Haz perdido la ronda " + (i+1));
                    break;
                }
        }
    }
}