package bridge.conBridge;

public class Linux extends Plataforma {
    public Linux(Arquitectura arqu) {
        super(arqu);
    }

    @Override
    public void plataforma() {
        System.out.println("Plataforma: Linux");
    }
    public void arquitectura(){
        arqu.arquitectura();
    }
}
