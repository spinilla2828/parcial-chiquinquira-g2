package parcial1;

import java.util.ArrayList;
import java.util.List;

public class GestorEstudiantes {
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(String nombreBuscado) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return estudiante;
            }
        }
        return null; // El estudiante no está registrado
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.toString());
            System.out.println("----------------------------");
        }
    }

    public List<Estudiante> buscarEstudiantesPorAsignatura(String asignaturaBuscada) {
        List<Estudiante> estudiantesEncontrados = new ArrayList<>();
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getAsignaturas().contains(asignaturaBuscada)) {
                estudiantesEncontrados.add(estudiante);
            }
        }
        return estudiantesEncontrados;
    }
}
