package proxy;

public class Client {
    public static void main(String[] args) {
        CuentaDeAhorro miCuenta = new CuentaDeAhorro("Enrique",10000);
        TarjetaDeDebito tarjeta = new TarjetaDeDebito(miCuenta, "BS");

        tarjeta.depositar(100);

        tarjeta.setMoneda("USD");
        tarjeta.retirar(50);
    }
}
