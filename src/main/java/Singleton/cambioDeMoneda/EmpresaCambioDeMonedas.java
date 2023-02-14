package Singleton.cambioDeMoneda;

import java.util.HashMap;
import java.util.Map;

public class EmpresaCambioDeMonedas {
    private static EmpresaCambioDeMonedas instance;

    private static Map<String,Double> cambios;

    private EmpresaCambioDeMonedas(){
        cambios = new HashMap<>();
        cambios.put("Boliviano",1.0);
        cambios.put("Dolar",7.0);
        cambios.put("Euro",9.0);
    }

    private synchronized static void create() {
        if (instance == null) {
            instance = new EmpresaCambioDeMonedas();
        }
    }

    public static EmpresaCambioDeMonedas getInstance() {
        if (instance == null) {
            create();
        }
        return instance;
    }

    public double cambiarABolivianos(double cantidadAConvertir, String monedaOriginal){
        return cantidadAConvertir*cambios.getOrDefault(monedaOriginal,0.0);
    }

    public double cambiarAMonedaExtranjera(double cantidadEnBolivianos, String monedaExtranjera){
        return cantidadEnBolivianos/cambios.getOrDefault(monedaExtranjera,Double.POSITIVE_INFINITY);
    }
}
