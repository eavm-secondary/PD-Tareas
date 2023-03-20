package composite;

import java.util.ArrayList;
import java.util.List;

public class LaboratorioComputadoras extends Component{
    private String nombre;

    private List<Component> computadoras = new ArrayList<>();

    public LaboratorioComputadoras(String nombre) {
        super(0);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Component> getComputadoras() {
        return computadoras;
    }

    public LaboratorioComputadoras addComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
        setPrecio(getPrecio()+computadora.getPrecio());
        return this;
    }

    public void removeComputadora(Computadora computadora) {
        this.computadoras.remove(computadora);
        setPrecio(getPrecio()-computadora.getPrecio());
    }

    @Override
    public void showPrecio() {
        System.out.println("---------------------------");
        System.out.println("Precio del laboratorio "+nombre+" es: "+getPrecio()+"Bs");
        for (Component c : computadoras) {
            System.out.print("-> "); c.showPrecio();
        }
    }
}
