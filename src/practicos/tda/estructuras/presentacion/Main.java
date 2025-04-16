package practicos.tda.estructuras.presentacion;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(5);
        lista.insert(3,2);
        lista.insert(7,6);
        lista.add(6);
        lista.add(8);
        System.out.println(lista);
    }
}
