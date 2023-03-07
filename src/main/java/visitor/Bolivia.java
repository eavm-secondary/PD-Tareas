package visitor;

public class Bolivia implements IPais {
    @Override
    public void aceptarVisita(IVisitor visitor) {
        visitor.visitBolivia(this);
    }
}
