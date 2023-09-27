
package parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    buscarEstudiante(scanner, gestor);
                    // Lógica para buscar un estudiante
                    break;
                case 3:
                    buscarEstudiantesPorAsignatura(scanner, gestor); 
                    break;
                case 4:
                    gestor.mostrarEstudiantes();
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
    
        private static int obtenerOpcion(Scanner scanner) {
        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.print("Seleccione una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                opcionValida = opcion >= 1 && opcion <= 5;
                if (!opcionValida) {
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } else {
                scanner.nextLine(); // Consumir la entrada no válida
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
        
        scanner.nextLine(); // Consumir la nueva línea
        return opcion;
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
    
    private static void buscarEstudiante(Scanner scanner, GestorEstudiantes gestor) {
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombreBuscado = scanner.nextLine();

        Estudiante estudianteEncontrado = gestor.buscarEstudiante(nombreBuscado);

        if (estudianteEncontrado != null) {
            System.out.println("Información del estudiante encontrado:");
            System.out.println(estudianteEncontrado.toString());
        } else {
            System.out.println("El estudiante no está registrado.");
        }
    }

    private static void buscarEstudiantesPorAsignatura(Scanner scanner, GestorEstudiantes gestor) {
        System.out.print("Ingrese el nombre de la asignatura a buscar: ");
        String asignaturaBuscada = scanner.nextLine();

        List<Estudiante> estudiantesEncontrados = gestor.buscarEstudiantesPorAsignatura(asignaturaBuscada);

        if (!estudiantesEncontrados.isEmpty()) {
            System.out.println("Estudiantes inscritos en la asignatura '" + asignaturaBuscada + "':");
            for (Estudiante estudiante : estudiantesEncontrados) {
                System.out.println(estudiante.toString());
                System.out.println("----------------------------");
            }
        } else {
            System.out.println("La asignatura '" + asignaturaBuscada + "' no tiene estudiantes inscritos.");
        }
    }
}