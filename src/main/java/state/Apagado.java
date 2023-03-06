package state;

public class Apagado implements  IStateComputer{
    @Override
    public String getName() {
        return "Apagado";
    }
    @Override
    public void computerBehavior(Computadora computadora) {
        if (!computadora.getProgramasAbiertos().isEmpty()) {
            System.out.println("Cerrando Programas...");
        }
        for (String program : computadora.getProgramasAbiertos()) {
            System.out.println(" > "+program);
        }
        computadora.closeAllPrograms();
        computadora.setConsumoCPU(0);
        computadora.setConsumoMemoriaRAM(0);
        computadora.showInfo();
    }
}
