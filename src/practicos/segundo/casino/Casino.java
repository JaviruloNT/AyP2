package practicos.segundo.casino;

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
        Fecha[] arr = new Fecha[9];
        int i = 0;
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
        System.out.println(fecha_max.toString());
    }
    public void printDiaMenosRecaudo() {
        Fecha fecha_min = getFechas()[0];
        for (Fecha f : getFechas()) {
            if (f.getRecaudado() < fecha_min.getRecaudado()) {
                fecha_min = f;
            }
        }
        //
        System.out.println(fecha_min);
    }
    public void printSemMasRecaudo() {
        Semana semana_max = semanas[0];
        for (Semana s : semanas) {
            if (s.getRecaudado() > semana_max.getRecaudado()) {
                semana_max = s;
            }
        }
        //
        System.out.println(semana_max);
    }
    public void printPromedioRecaudo() {
        int prom = 0;
        for (Fecha f : getFechas()) {
            prom += f.getRecaudado();
        }
        System.out.println("Promedio="+prom/getFechas().length);
    }
    public void printDiaBajoPromedio() {
        int prom = 0;
        for (Fecha f : getFechas()) {
            prom += f.getRecaudado();
        }
        prom /= getFechas().length;
        for (Fecha f : getFechas()) {
            if (f.getRecaudado() < prom) {
                System.out.println(f);
            }
        }
    }
    public void buscarFecha(int dia) {
    }
}
