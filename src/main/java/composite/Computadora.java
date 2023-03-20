package composite;

public class Computadora extends Component{

    private String modelo;
    public Computadora(String modelo, int precio) {
        super(precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void showPrecio() {
        System.out.println("El precio de la computadora "+modelo+" es: "+getPrecio()+"Bs");
    }
}
