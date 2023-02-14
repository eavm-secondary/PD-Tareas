package Singleton.cambioDeMoneda;

public class CasaDeCambio {
    public void cambiarMoneda(double cantidadAConverir, String monedaOriginal, String monedaSolicitada){
        EmpresaCambioDeMonedas cambiador = EmpresaCambioDeMonedas.getInstance();
        double bolivianos = cambiador.cambiarABolivianos(cantidadAConverir,monedaOriginal);
        double monedaCambiada = cambiador.cambiarAMonedaExtranjera(bolivianos,monedaSolicitada);

        System.out.println("Casa de Cambio: "+cantidadAConverir+" "+monedaOriginal+" a "+monedaSolicitada+" --> "+monedaCambiada);
        CuentaBancaria.getInstance().guardarCambio(bolivianos);
    }
}
