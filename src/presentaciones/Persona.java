package presentaciones;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.nombre.compareTo(o.nombre) == 0) {
            return this.apellido.compareTo(o.apellido);
        }
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ",apellido=" + apellido +"]";
    }
}
