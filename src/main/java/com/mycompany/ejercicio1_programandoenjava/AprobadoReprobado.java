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
 *Crear un programa que imprima en consola un nombre de estudiante, una nota y una etiqueta que diga Aprobado o Reprobado,
 * dependiendo del valor de la nota que tenga. Ejemplo:
Daniel 65 Reprobado
Monica 89 Aprobado
 */

public class AprobadoReprobado {
    public static void main(String[] args) {
        // Crear un arreglo con nombres y notas de estudiantes
        String[][] estudiantes = {
            {"Marvin", "80"},
            {"Arnol", "99"},
            {"Luis", "55"},
            {"Sofia", "74"},
            {"Carlos", "69"}
        };

        // Recorrer el arreglo e imprimir la evaluación de cada estudiante
        System.out.println("Evaluacion de estudiantes:");
        for (String[] estudiante : estudiantes) {
            String nombre = estudiante[0];
            int nota = Integer.parseInt(estudiante[1]);
            String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";  // Condición para aprobar o reprobar
            System.out.println(nombre + " " + nota + " " + resultado);
        }
    }
}
