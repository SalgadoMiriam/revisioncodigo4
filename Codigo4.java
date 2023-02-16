package org.example;
//Juego de piedra, papel o tijeras
// importar para clase Scanner

import java.util.Scanner;

//falta un metodo main para poder correr el programa
public class Codigo4 {

    public static void main(String[] args) {
        //falta leer el input

        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        // cambio en el string jugador 1 -> jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        //mismo caso del input
        Scanner s2 = new Scanner(System.in);
        //leer s2 y no s
        String j2 = s2.nextLine();

        //correccion comparacion de strings en ambos if
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;

            // agregar un booleano para no permitir inputs invalidos
            boolean condicion = true;
            //agregar breaks en cada switch
            switch (j1) {
                case "piedra" -> {
                    if (j2.equals("tijeras")) {
                        g = 1;

                    }
                }
                case "papel" -> {
                    if (j2.equals("piedra")) {
                        g = 1;

                    }
                }

                //cambio de string "tijera" -> "tijeras"
                case "tijeras" -> {
                    if (j2.equals("papel")) {
                        g = 1;

                    }
                }

                //añadir la accion en caso de default
                default -> {
                    System.out.println("Input invalido");
                    condicion = false;
                }
            }
            if (condicion) {
                System.out.println("Gana el jugador " + g);
            }
        }
    }

}