package practicos.segundo.casino;

public class Fecha {
    private final Mesa[] mesas;
    private int recaudado = 0;
    public Fecha(Mesa[] mesas) {
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
        return "Fecha[recaudado="+recaudado+"]";
    }
}
