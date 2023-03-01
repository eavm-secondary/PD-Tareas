package chainOfResponsability;

public class Debugger implements IHandler{
    private IHandler next;

    public Debugger() {
        this.next = new Soporte();
        this.next.setNext(new PO());
        this.next.next().setNext(new QA());
        this.next.next().next().setNext(new DEV());
    }

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
        next.resolver(falla);
    }
}
