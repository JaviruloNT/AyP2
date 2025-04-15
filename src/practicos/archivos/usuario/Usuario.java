package practicos.archivos.usuario;

public class Usuario {
    private String username;
    private String password;

    public Usuario(String user, String pass) {
        username = user;
        password = pass;
    }

    @Override
    public String toString() {
        return username + "," + password;
    }
}
