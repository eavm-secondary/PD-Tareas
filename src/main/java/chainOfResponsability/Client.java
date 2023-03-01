package chainOfResponsability;

public class Client {
    public static void main(String[] args) {
        Debugger dbug = new Debugger();

        Falla falla = new Falla("Falla 1", "critica", "Se murio un empleado");
        dbug.resolver(falla);
    }
}
