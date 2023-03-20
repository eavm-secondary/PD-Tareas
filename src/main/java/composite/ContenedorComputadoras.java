package composite;

import java.util.ArrayList;
import java.util.List;

public class ContenedorComputadoras extends Component{
    private String nombre;

    private List<Component> laboratorios = new ArrayList<>();

    public ContenedorComputadoras(String nombre) {
        super(0);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Component> getLaboratorios() {
        return laboratorios;
    }

    public ContenedorComputadoras addLaboratorio(LaboratorioComputadoras lab) {
        this.laboratorios.add(lab);
        setPrecio(getPrecio()+lab.getPrecio());
        return this;
    }

    public void removeLaboratorio(LaboratorioComputadoras lab) {
        this.laboratorios.remove(lab);
        setPrecio(getPrecio()-lab.getPrecio());
    }

    @Override
    public void showPrecio() {
        System.out.println("****************************");
        System.out.println("Precio del contenedor "+nombre+" es: "+getPrecio()+"Bs");
        for (Component c : laboratorios) {
            c.showPrecio();
        }
    }
}
