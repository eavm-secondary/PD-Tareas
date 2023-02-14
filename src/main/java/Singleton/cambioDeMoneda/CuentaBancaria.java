package Singleton.cambioDeMoneda;

public class CuentaBancaria {
    private static CuentaBancaria instance;
    private double saldo=0;

    private CuentaBancaria(){}
    private synchronized static void create() {
        if (instance == null) {
            instance = new CuentaBancaria();
        }
    }

    public static CuentaBancaria getInstance() {
        if (instance == null) {
            create();
        }
        return instance;
    }

    public synchronized void guardarCambio(double cantidadEnBolivianos){
        saldo+=cantidadEnBolivianos;
        System.out.println("**************************************");
        System.out.println("INFO Cuenta > Se ha depositado "+cantidadEnBolivianos+" bolivianos");
        System.out.println("INFO Cuenta > Saldo actual: "+saldo);
        System.out.println("**************************************");
    }

}
