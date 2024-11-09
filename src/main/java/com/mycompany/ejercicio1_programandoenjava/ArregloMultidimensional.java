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
 *Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase (nombre, apellido, carrera, lugarTrabajo),
 * tomando como referencia de la información colocada en el foro Conociendonos. Llenar 5 registros Ejemplo:
Daniel Medina      Electronica TEST
Monica Jiz         Computacion  IMSA
 */

public class ArregloMultidimensional {
    public static void main(String[] args) {
        // Crear un arreglo multidimensional para almacenar los datos de 5 compañeros
        String[][] compañeros = {
            {"Marvin", "Rodriguez", "Ingenieria", "LEAR"},
            {"Pedro", "Lopez", "Computacion", "IMSA"},
            {"Juan", "Perez", "Ingenieria Civil", "Construcciones Perez"},
            {"Sofia", "Gonzalez", "Arquitectura", "Estudio Creativo"},
            {"Luis", "Ramirez", "Sistemas", "Tech Solutions"}
        };

        // Imprimir los datos personales en consola
        System.out.println("Datos de mis compañeros de clase:");
        for (String[] compañero : compañeros) {
            System.out.println("Nombre: " + compañero[0] + " " + compañero[1]);
            System.out.println("Carrera: " + compañero[2]);
            System.out.println("Lugar de Trabajo: " + compañero[3]);
            System.out.println();
        }
    }
}