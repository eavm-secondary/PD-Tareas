package observer;

import java.util.ArrayList;
import java.util.List;

public class Persona implements ICliente {
    private String nombre;
    private String ci;
    private final List<String> tiposNotificacion = new ArrayList<>();

    public Persona(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public List<String> getTiposNotificacion() {
        return tiposNotificacion;
    }

    public Persona addTipoNotificacion(String tipoNotificacion) {
        this.tiposNotificacion.add(tipoNotificacion.toLowerCase());
        return this;
    }

    @Override
    public void update(Anuncio anuncio) {
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println(" >> Notificación >> ");
        System.out.println("Titulo: "+ anuncio.getTitulo());
        System.out.println("Descripcion: "+ anuncio.getDescripcion());
        System.out.println("------------------------------------------------------");
    }
}
