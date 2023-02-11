package factory;

public class Aeropuerto {
    private String pais;
    private String ciudad;
    private String nombre;

    public Aeropuerto(String pais, String ciudad, String nombre) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    public void showInfo() {
        System.out.println("Pais: "+pais);
        System.out.println("Ciudad: "+ciudad);
    }
}
