package presentaciones.estudiantes;

import java.util.Arrays;

public class Main {
    public static void imprimir(Estudiante[] lista) {
        for (Estudiante e : lista) {
            System.out.println(e.toString());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Estudiante[] lista = {
                new Estudiante("Albaro","Hegemann",2024,7.5),
                new Estudiante("Elias","Alegre",2024,8),
                new Estudiante("Elias","Gomez",2024,6),
                new Estudiante("Axel","Salas",2024,9)
        };
        imprimir(lista);
        EstudianteXNombre ordenNombre = new EstudianteXNombre();
        Arrays.sort(lista,ordenNombre);
        imprimir(lista);
        EstudianteXPromedio ordenPromedio = new EstudianteXPromedio();
        Arrays.sort(lista,ordenPromedio.reversed());
        imprimir(lista);
    }
}
