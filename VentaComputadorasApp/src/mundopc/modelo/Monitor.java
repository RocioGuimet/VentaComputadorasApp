package mundopc.modelo;

public class Monitor {
    private final int idMonitor; //Creamos un ID por cada monitor
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    // Creamos constructor
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio){
        this(); //Llamamos al constructor
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
