package state;

import java.util.Random;

public class Encendido implements IStateComputer{

    @Override
    public String getName() {
        return "Encendido";
    }

    @Override
    public void computerBehavior(Computadora computadora) {
        Random rnd = new Random();
        if (computadora.getProgramasAbiertos().isEmpty() || rnd.nextBoolean()){
            computadora.openProgram("Program "+rnd.nextInt(1000));
        } else {
            computadora.closeProgram(computadora.getProgramasAbiertos().get(rnd.nextInt(computadora.getProgramasAbiertos().size())));
        }
        computadora.setConsumoCPU(computadora.getProgramasAbiertos().size()*5);
        computadora.setConsumoMemoriaRAM(computadora.getProgramasAbiertos().size()*5);
        computadora.showInfo();
    }
}
