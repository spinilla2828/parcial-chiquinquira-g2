
package parcial1;

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
                    // Lógica para agregar un estudiante
                    break;
                case 2:
                    // Lógica para buscar un estudiante
                    break;
                case 3:
                    buscarEstudiantesPorAsignatura(scanner, gestor); 
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