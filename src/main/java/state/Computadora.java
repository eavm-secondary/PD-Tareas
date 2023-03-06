package state;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<String> programasAbiertos = new ArrayList<>();
    private int consumoMemoriaRAM;
    private int consumoCPU;
    private IStateComputer stateComputer;


    public Computadora() {
        setStateComputer(new Apagado());
        useComputer();
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        System.out.println("\n>>>>> Estado: "+stateComputer.getName()+" >>>>>");
        this.stateComputer = stateComputer;
    }

    public List<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void openProgram(String program) {
        this.programasAbiertos.add(program.toLowerCase());
    }

    public void closeProgram(String program) {
        this.programasAbiertos.remove(program.toLowerCase());
    }

    public void closeAllPrograms() {
        this.programasAbiertos.clear();
    }
    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public int getConsumoMemoriaRAM() {
        return consumoMemoriaRAM;
    }

    public void setConsumoMemoriaRAM(int consumoMemoriaRAM) {
        this.consumoMemoriaRAM = consumoMemoriaRAM;
    }

    public void useComputer(){
        this.stateComputer.computerBehavior(this);
    }

    public void showInfo() {
        System.out.println("Programas abiertos: "+programasAbiertos);
        System.out.println("Consumo de RAM: "+consumoMemoriaRAM+"%");
        System.out.println("Consumo de CPU: "+consumoCPU+"%");
        System.out.println("*********************************************");
    }
}
