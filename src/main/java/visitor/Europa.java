package visitor;

public class Europa implements IPais{
    @Override
    public void aceptarVisita(IVisitor visitor) {
        visitor.visitEuropa(this);
    }
}
