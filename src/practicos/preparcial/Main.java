package practicos.preparcial;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        //
        cola.enqueue(new Mesa(new String[]{"Papas Fritas","Pollo","Ensalada","Milanesa de Carne"}));
        //
        cola.showAll();
        cola.showServido();
        cola.dequeue();
        cola.showAll();
        cola.showServido();
    }
}
