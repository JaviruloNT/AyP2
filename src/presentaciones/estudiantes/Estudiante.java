package presentaciones.estudiantes;

public class Estudiante {
    private final String nombre;
    private final String apellido;
    private final int ano;
    private final double promedio;

    public Estudiante(String nombre, String apellido, int ano, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ano = ano;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante[nombre=" + nombre + ",apellido="+apellido+",año="+ano+",nota="+promedio+"]";
    }
}
