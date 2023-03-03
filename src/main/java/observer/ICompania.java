package observer;

public interface ICompania {
    void attach (ICliente cliente);
    void deattach (ICliente cliente);
    void notifyClients(Anuncio anuncio);
}
