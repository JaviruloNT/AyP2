package practicos.segundo.casino;

public class Mesa implements Comparable<Mesa>{
    private final String juego;
    private final String[] croupiers = new String[3];
    private final int dinero_ini;
    private final int dinero_fin;
    private final int max_apuesta;
    //
    public Mesa(String juego, String croupierA, String croupierB, String croupierC, int ini, int fin, int max_apuesta) {
        this.juego = juego;
        croupiers[0] = croupierA;
        croupiers[1] = croupierB;
        croupiers[2] = croupierC;
        dinero_ini = ini;
        dinero_fin = fin;
        this.max_apuesta = max_apuesta;
    }
    //
    //
    public String[] getCroupiers() {
        return croupiers;
    }
    public String getJuego() {
        return juego;
    }
    public int getMax_apuesta() {
        return max_apuesta;
    }
    public int getDinero_ini() {
        return dinero_ini;
    }
    public int getDinero_fin() {
            return dinero_fin;
    }
    @Override
    public String toString() {
        return "Mesa[juego=" +juego+ ", croupierA="+croupiers[0]+", croupierB="+croupiers[1]+", croupierC="+croupiers[2]+", dinero_ini="+dinero_ini+", dinero_fin="+dinero_fin+", max_apuesta="+max_apuesta+"]";
    }
    public void print() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Mesa o) {
        return juego.compareTo(o.juego);
    }
}
