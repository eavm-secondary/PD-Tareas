package observer;

import java.util.List;

public interface ICliente {
    void update(Anuncio anuncio);
    List<String> getTiposNotificacion();

    ICliente addTipoNotificacion(String tipoNotificacion);
}
