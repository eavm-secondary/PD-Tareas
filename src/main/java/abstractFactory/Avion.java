package abstractFactory;

public class Avion {
    private String marca;
    private String modelo;
    private int capacidad;
    private int numeroDeAsientos;

    public Avion(String marca, String modelo, int capacidad, int numeroDeAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void showInfo() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Numero de Asientos: "+numeroDeAsientos);
    }
}
