package practicos.tipodedatos.casino;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("[0] Salir");
        System.out.println("[1] Dia mas recaudado");
        System.out.println("[2] Dia menos recaudado");
        System.out.println("[3] Semana mas recaudado");
        System.out.println("[4] Promedio por dia");
        System.out.println("[5] Dias bajo promedio");
        System.out.println("[6] Buscar dia");
    }
    public static void main(String[] args) {
        Casino casino = new Casino(new Semana[]{
                new Semana(new Fecha[]{
                        new Fecha(new Mesa[]{
                                new Mesa("Ruleta", "Pedro", "Juan", "Luis", 10000, 500000, 25000),
                                new Mesa("Punto", "Matias", "Agustin", "Roberto", 50000, 1500000, 50000)
                        }),
                        new Fecha(new Mesa[]{
                                new Mesa("Ruleta","Aaron","Marcos","Alvaro",10000,500000,25000),
                                new Mesa("Punto","Braian","Tobias","Jose",50000,1500000,50000)
                        })
                }),
                new Semana(new Fecha[]{
                        new Fecha(new Mesa[]{
                                new Mesa("Ruleta","Aaron","Marcos","Alvaro",10000,500000,25000),
                                new Mesa("Punto","Braian","Tobias","Jose",50000,1500000,50000)
                        }),
                        new Fecha(new Mesa[]{
                                new Mesa("Ruleta","Victor","Hernan","Mauro",75000,4750000,34000),
                                new Mesa("Punto","Gabriel","Rodrigo","Joaquin",1000000,2200000,250000)
                        })
                })
        });
        Scanner sc = new Scanner(System.in);
        int caso = 1;
        while (caso != 0) {
            menu();
            // Lector
            try {
                caso = sc.nextInt();
            } catch (Exception _) {
                System.out.println("Opcion invalida");
                continue;
            }
            // Definir opciones
            switch (caso) {
                case 0:
                    break;
                case 1:
                    casino.printDiaMasRecaudo();
                case 2:
                    casino.printDiaMenosRecaudo();
                case 3:
                    casino.printSemMasRecaudo();
                case 4:
                    casino.printPromedioRecaudo();
                case 5:
                    casino.printDiaBajoPromedio();
                case 6:
                    casino.buscarFecha(1);
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
