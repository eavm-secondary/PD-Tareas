package decorator;

public class Turbo extends Accesorio{

    double velocidadExtra;

    public Turbo(IComponent component, double velocidadExtra) {
        super(component);
        this.velocidadExtra = velocidadExtra;
    }

    @Override
    public void show() {

        super.show();
        System.out.println("TURBO: "+velocidadExtra+" km/h");
    }

}