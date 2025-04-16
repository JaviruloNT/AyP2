package practicos.archivos.usuario;

import javax.swing.plaf.synth.SynthUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        //
        while (true) {
            try {
                System.out.println("Ingrese un numero:");
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception _) {
                System.out.println("No se ha ingresado un numero.");
            }
        }
        //
        System.out.println("Numero ingresado: " + num);
    }
}
