package parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Instanciar clase gestor estudiante
        GestorEstudiantes gestor = new GestorEstudiantes();

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
                    agregarEstudiante(scanner, gestor);
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
    
    private static void agregarEstudiante(Scanner scanner, GestorEstudiantes gestor) {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese las asignaturas en las que está inscrito (separadas por comas): ");
        String asignaturasStr = scanner.nextLine();
        String[] asignaturasArray = asignaturasStr.split(",");
        List<String> asignaturas = new ArrayList<>();

        for (String asignatura : asignaturasArray) {
            asignaturas.add(asignatura.trim());
        }

        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, asignaturas);
        gestor.agregarEstudiante(nuevoEstudiante);
        System.out.println("Estudiante agregado correctamente.");
    }