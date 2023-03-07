package visitor;

public class EEUU implements IPais{
    @Override
    public void aceptarVisita(IVisitor visitor) {
        visitor.visitEEUU(this);
    }
}
