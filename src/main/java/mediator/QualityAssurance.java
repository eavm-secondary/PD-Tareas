package mediator;

public class QualityAssurance extends Profesional{
    private String grado;
    public QualityAssurance(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("grado: "+grado);
        System.out.println("***********************");
    }

    public String getGrado() {
        return grado;
    }

    public QualityAssurance setGrado(String grado) {
        this.grado = grado;
        return this;
    }
}
