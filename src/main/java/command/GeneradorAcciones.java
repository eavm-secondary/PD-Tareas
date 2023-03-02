package command;

import java.util.ArrayList;
import java.util.List;

public class GeneradorAcciones {
    private String nombreAccion;
    private List<ICommand> acciones = new ArrayList<>();

    public GeneradorAcciones(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    public GeneradorAcciones addCommand(ICommand command){
        acciones.add(command);
        return this;
    }

    public void run(){
        System.out.println("Ejecutando Accion: "+nombreAccion);
        for (ICommand cmd: acciones) {
            cmd.execute();
        }
        System.out.println("*****************************");
//        acciones.clear();
    }


}
