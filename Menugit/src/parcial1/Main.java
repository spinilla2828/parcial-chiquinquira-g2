/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Buscar estudiante por asignatura");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para agregar un estudiante
                    break;
                case 2:
                    // Lógica para buscar un estudiante
                    break;
                case 3:
                    // Lógica para buscar un estudiante por asignatura
                    break;
                case 4:
                    // Lógica para mostrar todos los estudiantes
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
