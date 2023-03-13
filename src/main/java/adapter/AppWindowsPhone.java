package adapter;

public class AppWindowsPhone implements IAppsEmpresa1{
    @Override
    public void login() {
        System.out.println("Windows Phone: Login...");
    }

    @Override
    public void logout() {
        System.out.println("Windows Phone: Logout...");
    }

    @Override
    public void reportes() {
        System.out.println("Windows Phone: Generando Reporte...");
    }
}
