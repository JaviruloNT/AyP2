package test.database;

public class Usuario extends Encoder{
    private final String user;
    private final String pass;
    //
    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    //
    public String getUser() {
        return user;
    }
}
