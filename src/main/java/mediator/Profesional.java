package mediator;

public abstract class Profesional {
    protected ICanalComunication canalComunication;
    private String ci;
    private String name;
//    private String cargo; // QA / DEV / SM

    public Profesional(ICanalComunication canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getCi() {
        return ci;
    }

    public Profesional setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Profesional setName(String name) {
        this.name = name;
        return this;
    }

//    public String getCargo() {
//        return cargo;
//    }

//    public Profesional setCargo(String cargo) {
//        this.cargo = cargo;
//        return this;
//    }

    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("ci: "+ci);
        System.out.println("name: "+name);
//        System.out.println("cargo: "+cargo);

    }

    public void send(String msg){
        canalComunication.send(msg,this);
    }

    public void received(String msg) {
        this.showInfo();
        System.out.println("INFO > received > "+msg+"\n");
    }
}
