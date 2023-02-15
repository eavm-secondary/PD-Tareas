package builder;

public class Director {
    private BuilderComputadora builder;

    public Computadora getComputadora(){
        return builder.getComputadora();
    }

    public void setBuilder(BuilderComputadora builder) {
        this.builder = builder;
    }

    public void buildComputadora(){
        builder.buildComputadora();
        builder.buildMemoria();
        builder.buildMonitor();
        builder.buildMouse();
        builder.buildProcesador();
        builder.buildTeclado();
        builder.buildVideo();
    }
}
