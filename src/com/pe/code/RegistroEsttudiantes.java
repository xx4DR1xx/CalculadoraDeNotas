
package com.pe.code;


import java.util.Scanner;


public class RegistroEsttudiantes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");

        System.out.print("Ingrese nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese nota: ");
        double nota = teclado.nextDouble();

        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    
}
