package mediator;

public class Developer extends Profesional{
    private String lenguaje;
    public Developer(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("lenguaje: "+lenguaje);
        System.out.println("***********************");
    }
    public String getLenguaje() {
        return lenguaje;
    }

    public Developer setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }
}
