package decorator;

public class Vagoneta implements IComponent {
    private double velocidad;

    public Vagoneta(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void show() {
        System.out.println("Vagoneta ----------------------------");
        System.out.println("Velocidad: "+velocidad+"km/h");
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}