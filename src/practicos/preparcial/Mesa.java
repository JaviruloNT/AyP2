package practicos.preparcial;

public class Mesa {
    private static int totalMesas;
    private int numero;
    private int comensales;
    private String[] pedidos = new String[8];
    private boolean servido;

    public Mesa(String[] pedidos) {
        for (int i = 0; i < pedidos.length; i++) {
            this.pedidos[i] = pedidos[i];
        }
        //
        comensales = pedidos.length;
        //
        numero = totalMesas;
        totalMesas++;
        //
        servido = false;
    }

    public boolean isServido() {
        return servido;
    }

    public void setServido(boolean servido) {
        this.servido = servido;
    }

    @Override
    public String toString() {
        String texto = "Mesa[numero=" + numero + ",comensales=" + comensales;
        for (int i = 0; i < comensales; i++) {
            texto += ",comensal" + (i+1) + "=" + pedidos[i];
        }
        texto += ",servido=" + servido + "]";
        return texto;
    }
}
