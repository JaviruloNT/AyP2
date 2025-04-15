package practicos.tda.tiempo;

public class Tiempo {
    private Fecha fecha;
    private Hora hora;
    //
    public Tiempo(Fecha fecha, Hora hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    //
    @Override
    public String toString() {
        return fecha.toString() + " " + hora.toString();
    }
    public String toStringCorto() {
        return fecha.toStringCorto() + " " + hora.toStringCorto();
    }
    public String toStringMeridiano() {
        return fecha.toStringLargo() + " " + hora.toStringMeridiano();
    }
}
