package practicos.tipodedatos.casino;

public class Casino {
    private Semana[] semanas;
    //
    private Fecha dia_mas_recaudo;
    private Fecha dia_menos_recaudo;
    private Semana sem_mas_recaudo;
    private int promedio_recaudo;
    private Fecha[] dia_bajo_promedio;

    //
    public Casino(Semana[] semanas) {
        this.semanas = semanas;
    }

    //
    public Fecha[] getFechas() {
        int i = 0;
        for (Semana s : semanas) {
            for (Fecha f : s.getDias()) {
                i++;
            }
        }
        Fecha[] arr = new Fecha[i];
        i = 0;
        for (Semana s : semanas) {
            for (Fecha f : s.getDias()) {
                arr[i] = f;
                i++;
            }
        }
        return arr;
    }
        public void printDiaMasRecaudo() {
            Fecha fecha_max = getFechas()[0];
            for (Fecha f : getFechas()) {
                if (f.getRecaudado() > fecha_max.getRecaudado()) {
                    fecha_max = f;
                }
            }
            //
            fecha_max.print();
        }
        public void printDiaMenosRecaudo() {
            Fecha fecha_min = getFechas()[0];
            for (Fecha f : getFechas()) {
                if (f.getRecaudado() < fecha_min.getRecaudado()) {
                    fecha_min = f;
                }
            }
            //
            fecha_min.print();
        }
        public void printSemMasRecaudo() {
            Semana semana_max = semanas[0];
            for (Semana s : semanas) {
                if (s.getRecaudado() > semana_max.getRecaudado()) {
                    semana_max = s;
                }
            }
            //
            semana_max.print();
        }
        public void printPromedioRecaudo() {
            int prom = 0;
            for (Fecha f : getFechas()) {
                prom += f.getRecaudado();
            }
            System.out.println("Promedio=" + prom / getFechas().length);
        }
        public void printDiaBajoPromedio() {
            int prom = 0;
            for (Fecha f : getFechas()) {
                prom += f.getRecaudado();
            }
            prom /= getFechas().length;
            for (Fecha f : getFechas()) {
                if (f.getRecaudado() < prom) {
                    f.print();
                }
            }
        }
        public void buscarFecha(int dia) {
            // Casos erroneos
            Fecha fecha;
            try {
                fecha = getFechas()[dia];
            } catch (Exception _) {
                System.out.print("Fecha invalida");
                return;
            }
            if (dia > getFechas().length || dia < 1) {
                System.out.print("Fecha invalida");
                return;
            }
            //TODO: Agregar buscador de fecha
            Mesa mesa_max = fecha.getMesas()[0];
            for (Mesa m : fecha.getMesas()) {
                if (m.getDinero_fin() - m.getMax_apuesta() > mesa_max.getMax_apuesta()) {
                    mesa_max = m;
                }
            }
            mesa_max.print();
        }
    }