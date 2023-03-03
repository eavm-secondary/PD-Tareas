package observer;

public class Anuncio {
    private String titulo;
    private String descripcion;
    private String tipoAnuncio;

    public Anuncio(String titulo, String descripcion, String tipoAnuncio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }
}
