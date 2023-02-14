package abstractFactory;

public class Persona {
    private String nombre;
    private String CI;

    public Persona(String nombre, String CI) {
        this.nombre = nombre;
        this.CI = CI;
    }

    public void showInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+CI);
    }
}
