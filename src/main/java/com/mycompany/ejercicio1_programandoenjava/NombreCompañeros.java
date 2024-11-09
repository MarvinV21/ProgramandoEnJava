/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_programandoenjava;

/**
 * @author marvi
 */

/**
 * Crear un arrelo que guarde e imprima 10 nombres de tus compañeros de la clase
 */

public class NombreCompañeros {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar 10 nombres
        String[] nombres = {
            "Marvin", "Arnold", "Pedro", "Ana", "Luis",
            "Maria", "Carlos", "Laura", "Jose", "Marta"
        };

        // Imprimir los nombres en consola
        System.out.println("Nombres de mis compañeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}