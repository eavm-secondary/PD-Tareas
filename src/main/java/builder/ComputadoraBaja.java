package builder;

public class ComputadoraBaja extends BuilderComputadora{

    @Override
    public void buildMonitor() {
        computadora.setMonitor("24");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("normal");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("8gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("i5");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("4");
    }
}
