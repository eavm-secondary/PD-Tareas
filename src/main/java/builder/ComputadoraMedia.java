package builder;

public class ComputadoraMedia extends BuilderComputadora{

    @Override
    public void buildMonitor() {
        computadora.setMonitor("32");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("luminos");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("luminos");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("16gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("i7");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("8");
    }
}
