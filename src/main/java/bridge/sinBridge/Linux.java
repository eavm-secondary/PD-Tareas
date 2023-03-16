package bridge.sinBridge;

public abstract class Linux extends Plataforma {
    @Override
    public void plataforma() {
        System.out.println("Plataforma: Linux");
    }
    public abstract void arquitectura();
}
