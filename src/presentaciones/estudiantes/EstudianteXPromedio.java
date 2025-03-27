package presentaciones.estudiantes;

import java.util.Comparator;

public class EstudianteXPromedio implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return (int)(o1.getPromedio() - o2.getPromedio());
    }
}
