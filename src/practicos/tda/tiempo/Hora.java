package practicos.tda.tiempo;

public class Hora {
    private int hora;
    private int min;
    private int seg;
    //
    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    //
    @Override
    public String toString() {
        return hora +":"+ min +":"+ seg;
    }
    public String toStringCorto() {
        return hora +":"+ min;
    }
    public String toStringMeridiano() {
        if (hora >= 12) {
            return (hora-12) +":"+ min +" PM";
        } else {
            return hora +":"+ min +" AM";
        }
    }
}