package decorator;

public class Accesorio implements IComponent {
    private IComponent component;

    public Accesorio(IComponent component) {
        this.component = component;
    }



    @Override
    public void show() {
        component.show();
    }



    public IComponent getComponent() {
        return component;
    }



    public void setComponent(IComponent component) {
        this.component = component;
    }


    @Override
    public double getVelocidad() {
        throw new UnsupportedOperationException("Unimplemented method 'getVelocidad'");
    }


}