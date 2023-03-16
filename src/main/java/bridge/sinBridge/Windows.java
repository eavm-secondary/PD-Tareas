package bridge.sinBridge;

public abstract class Windows extends Plataforma {
    @Override
    public void plataforma() {
        System.out.println("Plataforma: Windows");
    }
    public abstract void arquitectura();
}
