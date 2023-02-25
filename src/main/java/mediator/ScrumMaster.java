package mediator;

public class ScrumMaster extends Profesional{
    private String certificaciones;
    public ScrumMaster(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("certificaciones: "+certificaciones);
        System.out.println("***********************");
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public ScrumMaster setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
        return this;
    }
}
