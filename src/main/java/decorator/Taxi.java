package decorator;

public class Taxi implements IComponent {
    private double velocidad;

    public Taxi(double velocidad) {
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
        System.out.println("Taxi -------------------------");
        System.out.println("Velocidad: "+velocidad+"km/h");
    }

}
