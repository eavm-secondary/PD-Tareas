package abstractFactory;

public class Cliente {
    public static void main(String[] args) {
        IPasaje p1 = TicketsAbstractFactory.make("standard");
        IPasaje p2 = TicketsAbstractFactory.make("standard");
        IPasaje p3 = TicketsAbstractFactory.make("solidario");
        IPasaje p4 = TicketsAbstractFactory.make("solidario");
        IPasaje p5 = TicketsAbstractFactory.make("infante");
        IPasaje p6 = TicketsAbstractFactory.make("infante");
    }
}
