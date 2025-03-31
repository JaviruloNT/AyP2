package practicos.segundo.casino;

public class Semana {
    private final Fecha[] dias;
    private int recaudado;
    public Semana(Fecha[] dias) {
        this.dias = dias;
        for (Fecha d : dias) {
            recaudado += d.getRecaudado();
        }
    }
    public Fecha[] getDias() {
        return dias;
    }
    public int getRecaudado() {
        return recaudado;
    }

    @Override
    public String toString() {
        return "Semana[recaudado="+recaudado+"]";
    }
}
