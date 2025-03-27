package presentaciones.estudiantes;

import java.util.Comparator;

public class EstudianteXNombre implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        if (o1.getNombre().compareTo(o2.getNombre()) == 0) {
            return o1.getApellido().compareTo(o2.getApellido());
        }
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
