package parcial1;

import java.util.List;

public class Estudiante {
    private final String nombre;
    private final int edad;
    private final List<String> asignaturas;

    public Estudiante(String nombre, int edad, List<String> asignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nAsignaturas inscritas: " + asignaturas;
    }
}
