package practicos.tda.tiempo;

public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(13,02,2005);
        System.out.println(f1);
        System.out.println(f1.toStringCorto());
        System.out.println(f1.toStringLargo());
        Hora h1 = new Hora(17,34,30);
        System.out.println(h1);
        System.out.println(h1.toStringCorto());
        System.out.println(h1.toStringMeridiano());
        Tiempo t1 = new Tiempo(f1,h1);
        System.out.println(t1);
        System.out.println(t1.toStringCorto());
        System.out.println(t1.toStringMeridiano());
    }
}
