package composite;

public class Client {

    public static void main(String []args){
        Computadora c1 = new Computadora("Intel I7", 2000);
        Computadora c2 = new Computadora("Intel I3", 1500);
        Computadora c3 = new Computadora("Amd 800", 2000);
        Computadora c4 = new Computadora("Mac 80", 9000);
        Computadora c5 = new Computadora("Mac 100", 15000);

        c3.showPrecio();

        LaboratorioComputadoras lab1 = new LaboratorioComputadoras("Laboratorio de Computacion");
        lab1.addComputadora(c1)
                .addComputadora(c2)
                .addComputadora(c3);

        lab1.showPrecio();

        LaboratorioComputadoras lab2 = new LaboratorioComputadoras("Laboratorio Mac's");
        lab2.addComputadora(c4).addComputadora(c5);

        ContenedorComputadoras contenedor = new ContenedorComputadoras("Contenedor UPB");
        contenedor.addLaboratorio(lab1).addLaboratorio(lab2);

        contenedor.showPrecio();
    }

}
