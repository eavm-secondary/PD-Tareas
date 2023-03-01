package chainOfResponsability;

public class PO implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void resolver(Falla falla) {
        if (falla.getSeveridad().equalsIgnoreCase("MEDIA")){
            System.out.println("> La falla ha sido resuleta por el equipo de PO");
            falla.showInfo();
        } else {
            System.out.println(">> La falla no puede ser resuelta por el equipo de PO, pasando al siguiente...");
            next.resolver(falla);
        }
    }
}
