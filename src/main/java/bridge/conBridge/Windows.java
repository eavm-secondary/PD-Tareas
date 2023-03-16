package bridge.conBridge;

public class Windows extends Plataforma {
    public Windows(Arquitectura arquitectura) {
        super(arquitectura);
    }

    @Override
    public void plataforma() {
        System.out.println("Plataforma: Windows");
    }
    public void arquitectura(){
        arqu.arquitectura();
    }
}
