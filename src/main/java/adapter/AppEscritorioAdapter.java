package adapter;

public class AppEscritorioAdapter implements IAppsEmpresa1{
    private AppEscritorio appEscritorio;

    public AppEscritorioAdapter(AppEscritorio appEscritorio) {
        this.appEscritorio = appEscritorio;
    }

    @Override
    public void login() {
        appEscritorio.iniciarSesion();
    }

    @Override
    public void logout() {
        appEscritorio.cerrarSesion();
    }

    @Override
    public void reportes() {
        System.out.println("App Escritorio: Generando reporte... "+appEscritorio.generacionDeDatos());
    }
}
