package mundopc.modelo;

public class Raton extends DispositivoEntrada {
    private final int idRaton;  //Inicializamos la variables en el constructor luego
    private static int contadorRatones;

    //Constructor
    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override //Sobreescribiendo el metodo de la clase padre
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "} " + super.toString(); // Llamamos metodo para no perder atributos clase padre

    }
}
