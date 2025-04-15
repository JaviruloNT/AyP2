package practicos.archivos.usuario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/practicos/archivos/usuario/datos_usuario.csv";
        Usuario[] usuarios = {
                new Usuario("Elias","123"),
                new Usuario("Javirulo","contraseñamuydificilderecordar"),
                new Usuario("Eliam","321"),
                new Usuario("Lenny","bizcochuelo"),
                new Usuario("Tomas","184091289048190")
        };
        // Escribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write("usuario,contraseña");
            writer.newLine();
            for (Usuario user : usuarios) {
                writer.write(user.toString());
                writer.newLine();
            }
            System.out.println("Archivo de usuarios guardado.");
        } catch (IOException e) {
            System.out.println("Hubo un problema al guardar archivos: " + e.getMessage());
        }
    }
}
