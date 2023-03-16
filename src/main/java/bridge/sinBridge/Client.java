package bridge.sinBridge;

public class Client {
    public static void main(String[] args) {
        Windows7x64 pc1 = new Windows7x64();
        pc1.plataforma();
        pc1.arquitectura();

        Linuxx86 pc2 = new Linuxx86();
        pc2.plataforma();
        pc2.arquitectura();
    }
}
