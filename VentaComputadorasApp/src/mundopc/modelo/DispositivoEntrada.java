package mundopc.modelo;

public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;

    //Constructor
    public DispositivoEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    @Override // Sobreescribiendo metodo de la clase padre (Objects por defecto)
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
