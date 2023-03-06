package state;

public class Client {
    public static void main (String []args){
        Computadora pc = new Computadora();

        pc.setStateComputer(new Encendido());
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();
        pc.useComputer();

        pc.setStateComputer(new Reiniciar());
        pc.useComputer();

    }

}
