package composite;

public abstract class Component {
    private int precio;
    public Component(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void showPrecio();

}
