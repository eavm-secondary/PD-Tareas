package adapter;

import java.util.List;

public class AppWeb implements IAppsEmpresa2{
    private String datos = "datos App Web";
    @Override
    public void iniciarSesion() {
        System.out.println("Web App: Iniciar Sesion...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Web App: Cerrar Sesion...");
    }

    @Override
    public String generacionDeDatos() {
        return datos;
    }
}
