package builder;

public class ComputadoraAlta extends BuilderComputadora{

    @Override
    public void buildMonitor() {
        computadora.setMonitor("45");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("luminos");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("gamer");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("32gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("i9");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("16");
    }
}
