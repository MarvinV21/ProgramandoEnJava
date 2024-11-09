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
 *Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100
 */

public class NumPares {
    public static void main(String[] args) {
        // Usar un ciclo for para imprimir los números pares del 2 al 100
        System.out.println("Numeros pares del 2 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
