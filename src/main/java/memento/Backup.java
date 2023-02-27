package memento;

public class Backup {
    private BaseDeDatos baseDeDatos;
    private String message;

    public Backup(String message, BaseDeDatos baseDeDatos) {
        this.message = message;
        this.baseDeDatos = baseDeDatos.clone();
    }

    public BaseDeDatos getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
}
