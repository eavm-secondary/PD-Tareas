package decorator;

public class GPS extends Accesorio {
    private String posicion;



    public GPS(IComponent component, String posicion) {
        super(component);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("GPS: "+posicion);
    }



}