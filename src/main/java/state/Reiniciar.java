package state;

public class Reiniciar implements IStateComputer {
    @Override
    public String getName() {
        return "Reiniciar";
    }
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.setStateComputer(new Apagado());
        computadora.useComputer();
        computadora.setStateComputer(new Encendido());
    }
}
