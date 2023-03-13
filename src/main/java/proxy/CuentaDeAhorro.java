package proxy;

public class CuentaDeAhorro implements ICuentaBancaria{
    private String titular;
    private int montoDisponible;

    public CuentaDeAhorro(String titular, int montoDisponible) {
        this.titular = titular;
        this.montoDisponible = montoDisponible;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getMontoDisponible() {
        return montoDisponible;
    }

    public void setMontoDisponible(int montoDisponible) {
        this.montoDisponible = montoDisponible;
    }

    @Override
    public void depositar(int monto) {
        montoDisponible+=monto;
        System.out.println("Deposito realizado exitosamente");
        System.out.println("Monto Disponible: "+montoDisponible);
    }

    @Override
    public void retirar(int monto) {
        if (monto>montoDisponible) {
            System.out.println("El monto solicitado es mayor al disponible");
        } else {
            montoDisponible-=monto;
            System.out.println("Retiro efectuado exitosamente");
        }
        System.out.println("Monto Disponible: "+montoDisponible);
    }
}
