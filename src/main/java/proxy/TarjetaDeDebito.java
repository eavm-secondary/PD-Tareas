package proxy;

public class TarjetaDeDebito implements ICuentaBancaria{
    private CuentaDeAhorro cuenta;
    private String moneda;

    public TarjetaDeDebito(CuentaDeAhorro cuenta, String moneda) {
        this.cuenta = cuenta;
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTitular() {
        return cuenta.getTitular();
    }

    public int getMontoDisponible() {
        return cuenta.getMontoDisponible();
    }

    @Override
    public void depositar(int monto) {
        if (moneda.equals("BS")){
            cuenta.depositar(monto);
        } else {
            System.out.println("Realizando conversion de moneda...");
            cuenta.depositar(monto*7);
        }
    }

    @Override
    public void retirar(int monto) {
        if (moneda.equals("BS")){
            cuenta.retirar(monto);
        } else {
            System.out.println("Realizando conversion de moneda...");
            cuenta.retirar(monto*7);
        }
    }
}
