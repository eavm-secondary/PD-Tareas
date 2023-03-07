package visitor;

public class Client {
    public static void main (String[]args){
        Bolivia bolivia = new Bolivia();
        EEUU eeuu = new EEUU();
        Europa europa = new Europa();

        LibreCambista libreCambista = new LibreCambista();

        bolivia.aceptarVisita(libreCambista);

        eeuu.aceptarVisita(libreCambista);

        europa.aceptarVisita(libreCambista);
    }
}
