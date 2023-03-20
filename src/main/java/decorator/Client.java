package decorator;

public class Client {
    public static void main(String[] args) {
        IComponent minibus = new Minibus(60);
        IComponent taxi = new Taxi(120);
        IComponent vagoneta = new Vagoneta(100);

        taxi = new TanqueDeGas(taxi, 5);
        vagoneta = new GPS(vagoneta, "Universidad");
        vagoneta = new Turbo(vagoneta,10.0);
        minibus = new GPS(minibus, "Casa");
        minibus = new Turbo(minibus,15.0);
        minibus = new TanqueDeGas(minibus, 16);

        minibus.show();
        taxi.show();
        vagoneta.show();
    }
}