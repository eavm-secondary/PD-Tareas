package Singleton.cambioDeMoneda;

public class LibreCambista {
    public void cambiarMoneda(double cantidadAConverir, String monedaOriginal, String monedaSolicitada){
        EmpresaCambioDeMonedas cambiador = EmpresaCambioDeMonedas.getInstance();
        double bolivianos = cambiador.cambiarABolivianos(cantidadAConverir,monedaOriginal);
        double monedaCambiada = cambiador.cambiarAMonedaExtranjera(bolivianos,monedaSolicitada);

        System.out.println("Libre Cambista: "+cantidadAConverir+" "+monedaOriginal+" a "+monedaSolicitada+" --> "+monedaCambiada);
        CuentaBancaria.getInstance().guardarCambio(bolivianos);
    }
}
