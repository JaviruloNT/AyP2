package presentaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona[] lista = {
                new Persona("Pedro","Andrada"),
                new Persona("Axel","Salas"),
                new Persona("Elias","Gomez"),
                new Persona("Albaro","Hegemann")
        };
        for (Persona a : lista) {
            System.out.println(a.toString());
        }
        System.out.println();
        Arrays.sort(lista);
        for (Persona a : lista) {
            System.out.println(a.toString());
        }
    }
}
