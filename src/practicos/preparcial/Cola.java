package practicos.preparcial;

public class Cola {
    private Mesa[] mesas;
    private int front;
    private int rear;
    //
    public Cola() {
        mesas = new Mesa[20];
        front = 0;
        rear = 0;
    }
    //
    public void enqueue(Mesa mesa) {
        mesas[rear] = mesa;
        rear++;
    }

    public void dequeue() {
        mesas[front].setServido(true);
        front++;
    }

    public void cancel() {
        rear--;
    }

    public void showAll() {
        System.out.println("Todos los pedidos:");
        for (int i = 0; i < rear; i++) {
            System.out.println("[" + i + "] " + mesas[i]);
        }
    }

    public void showServido() {
        System.out.println("Pedidos servidos:");
        for (int i = rear-1; i > 0; i--) {
            if (mesas[i].isServido() == true) {
                System.out.println("[" + i + "] " + mesas[i]);
            }
        }
    }

}
