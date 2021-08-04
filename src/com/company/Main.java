package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void menu() {
        Scanner ingresar = new Scanner(System.in);

        int op;
        do {
            System.out.println("            Bienvenido            ");
            System.out.println("1) Registrar Alumno");
            System.out.println("2) Mostrar Alumno");
            System.out.println("3) Modificar Alumno");
            System.out.println("4) Exit");
            System.out.println("Escriba una de las opciones:");
            op = ingresar.nextInt();
            switch (op) {
                case 1:

                    break;
                case 2:
                    Random aleatorio = new Random();
                    int N = aleatorio.nextInt(515552);
                    System.out.println("Carné : 0909-" + N);
                    break;
                case 3:
                    System.out.println("hola x2");
                    break;
                case 4:
                    System.out.println("hasta pronto");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Ingrese un número correcto segun las opciones");
                    break;

            }

        } while (op != 4);
    }

        public static void main(String[] args ) {
                menu();

        }
}
