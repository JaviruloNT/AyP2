package practicos.tda.tiempo;

public class Fecha {
    //private final static int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
    private final static String[] textoMes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private int dia;
    private int mes;
    private int ano;
    //
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //
    @Override
    public String toString() {
        return dia +"/"+ mes +"/"+ ano;
    }
    public String toStringCorto() {
        return dia +"/"+ mes;
    }
    public String toStringLargo() {
        return dia +" de " + textoMes[mes-1] + " de "+ ano;
    }
}
