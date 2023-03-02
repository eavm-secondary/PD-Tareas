package command;

public class Cubrirse implements ICommand{

    private Personaje personaje;

    public Cubrirse(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.cubrirse();
    }
}
