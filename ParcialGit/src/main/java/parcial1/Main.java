package parcial1;

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
                    // Lógica para agregar un estudiante
                    break;
                case 2:
                    buscarEstudiante(scanner, gestor);
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
}
//Errores se deben a que falta agregar las otras clases al proyecto: Estudiantes y GestorEstudiantes