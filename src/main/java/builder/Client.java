package builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ComputadoraMedia());
        director.buildComputadora();

        Computadora myCompu = director.getComputadora();
        myCompu.showInfo();
    }
}
