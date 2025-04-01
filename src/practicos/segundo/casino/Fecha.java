package practicos.segundo.casino;

public class Fecha implements Comparable<Fecha>{
    private static int cantidad = 0;
    private final int numero;
    private final Mesa[] mesas;
    private int recaudado = 0;
    public Fecha(Mesa[] mesas) {
        cantidad++;
        numero = cantidad;
        this.mesas = mesas;
        for (Mesa m : mesas) {
            recaudado += m.getDinero_fin() - m.getDinero_ini();
        }
    }
    public int getRecaudado() {
        return recaudado;
    }
    public Mesa[] getMesas() {
        return mesas;
    }

    @Override
    public String toString() {
        return "Fecha[numero="+numero+", recaudado="+recaudado+"]";
    }
    public void print() {
        System.out.println(toString());
        for (Mesa m : mesas) {
            m.print();
        }
    }

    @Override
    public int compareTo(Fecha o) {
        return numero - o.numero;
    }
}
