package decorator;

public class Minibus implements IComponent {
    private double velocidad;

    public Minibus(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void show() {
        System.out.println("Minibus ----------------------------------");
        System.out.println("Velocidad: "+velocidad+"km/h");
    }
}
