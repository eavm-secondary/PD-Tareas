package bridge.conBridge;

public class Client {
    public static void main(String[] args) {
        Windows win = new Windows(new ArquitecturaX64());
        win.plataforma();
        win.arquitectura();

        Linux lin = new Linux(new ArquitecturaX86());
        lin.plataforma();
        lin.arquitectura();
    }
}
