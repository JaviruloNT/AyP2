package test.database;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String file_datos = "datos.csv";
        String input;
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        //
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_datos))) {
            writer.write("user password");
            // TODO: terminar verificador de texto
                boolean valid = true;
                System.out.println("Ingrese un nombre de usuario:");
                input = sc.nextLine();
                //
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) > 126 || input.charAt(i) < 33) {
                        System.out.println("El caracter es invalido.");
                        valid = false;
                        break;
                    }
                }
                //
                if (valid) {

                }
        } catch (IOException e) {
            System.out.println("Hubo un error de escritura: " + e.getMessage());
        }
    }
}
