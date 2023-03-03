package observer;

import java.util.ArrayList;
import java.util.List;

public class CompaniaTelefonica implements ICompania {
    private final List<ICliente> clienteList = new ArrayList<>();

    @Override
    public void attach(ICliente cliente) {
        clienteList.add(cliente);
    }

    @Override
    public void deattach(ICliente cliente) {
        clienteList.remove(cliente);
    }

    @Override
    public void notifyClients(Anuncio anuncio) {
        System.out.println("COMP_TEL: Nuevo anuncio! >> "+ anuncio.getTitulo());
        System.out.println("****************************************************");
        for (ICliente cliente: clienteList) {
            if (cliente.getTiposNotificacion().contains(anuncio.getTipoAnuncio().toLowerCase())){
                cliente.update(anuncio);
            }
        }
        System.out.println("****************************************************");
    }
}
