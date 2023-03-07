package visitor;

public class LibreCambista implements IVisitor {
    @Override
    public void visitBolivia(Bolivia bolivia) {
        System.out.println("Cambiando dinero a bolivianos...");
    }

    @Override
    public void visitEEUU(EEUU eeuu) {
        System.out.println("Cambiando dinero a dolares...");
    }

    @Override
    public void visitEuropa(Europa europa) {
        System.out.println("Cambiando dinero a euros...");
    }
}
