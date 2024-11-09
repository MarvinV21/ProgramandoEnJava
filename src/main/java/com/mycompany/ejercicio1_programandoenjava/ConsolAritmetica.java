/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_programandoenjava;

/**
 *
 * @author marvi
 */

/**
 *Crear un programa que imprima en consola todas las operaciones aritméticas de dos números enteros
 *(suma, resta, multiplicación, divición, mod)
 */

import java.util.Scanner;

public class ConsolAritmetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner sc;
        sc = new Scanner(System.in);

        // Pedir dos números enteros al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        // Imprimir los resultados en consola
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el objeto Scanner
        sc.close();
    }
}