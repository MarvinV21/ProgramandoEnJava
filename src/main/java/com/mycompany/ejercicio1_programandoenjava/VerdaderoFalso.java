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
 *Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como
 * resultado verdadero o falso: M > T , T / K == -5 , (M+T == 7) || (M-T == 5)
 */

public class VerdaderoFalso {
    public static void main(String[] args) {
        // Declarar las variables
        int M = 6;
        int T = 1;
        int K = -10;

        // Evaluar las expresiones y mostrar los resultados
        System.out.println("M > T: " + (M > T));  // Evaluación de la primera expresión
        System.out.println("T / K == -5: " + (T / K == -5));  // Evaluación de la segunda expresión
        System.out.println("(M + T == 7) || (M - T == 5): " + ((M + T == 7) || (M - T == 5)));  // Evaluación de la tercera expresión
    }
}

