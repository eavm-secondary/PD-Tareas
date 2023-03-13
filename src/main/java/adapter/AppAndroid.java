package adapter;

public class AppAndroid implements IAppsEmpresa1{
    @Override
    public void login() {
        System.out.println("Android: Login...");
    }

    @Override
    public void logout() {
        System.out.println("Android: Logout...");
    }

    @Override
    public void reportes() {
        System.out.println("Android: Generando Reporte...");
    }
}
