package Singleton.cambioDeMoneda;

public class Cliente {
    public static void main(String[] args) {
        Banco banco = new Banco();
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        LibreCambista libreCambista = new LibreCambista();

        Thread hilo1 = new Thread(() -> {
            banco.cambiarMoneda(70,"Boliviano","Dolar");
            banco.cambiarMoneda(10,"Dolar","Boliviano");
        });

        Thread hilo2 = new Thread(() -> {
            casaDeCambio.cambiarMoneda(70,"Boliviano","Dolar");
            casaDeCambio.cambiarMoneda(10,"Euro","Dolar");
        });

        Thread hilo3 = new Thread(() -> {
            libreCambista.cambiarMoneda(80, "Boliviano", "Euro");
            libreCambista.cambiarMoneda(1, "Euro", "Boliviano");
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
