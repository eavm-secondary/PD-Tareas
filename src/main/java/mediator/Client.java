package mediator;

public class Client {
    public static void main (String args[]){

        Skype chatQA = new Skype();
        Skype chatDev = new Skype();
        Skype chatGeneral = new Skype();

        Profesional qa1 = new QualityAssurance(chatQA)
                .setGrado("grado 1").setCi("4474").setName("Horacio");
        Profesional qa2 = new QualityAssurance(chatQA)
                .setGrado("grado 2").setCi("6660").setName("Vivian");
        Profesional qa3 = new QualityAssurance(chatQA)
                .setGrado("grado3").setCi("9072").setName("Ema");

        Profesional dev1 =  new Developer(chatDev)
                .setLenguaje("java").setCi("1234").setName("Andres");
        Profesional dev2 =  new Developer(chatDev)
                .setLenguaje("c++").setCi("7893").setName("Celeste");
        Profesional dev3 =  new Developer(chatDev)
                .setLenguaje("kotlin").setCi("5908").setName("Pablo");

        Profesional sm1 = new ScrumMaster(chatGeneral)
                .setCertificaciones("iso-9090").setCi("2273").setName("Alexis");
        Profesional sm2 = new ScrumMaster(chatGeneral)
                .setCertificaciones("iso-8791").setCi("9087").setName("Tommy");
        Profesional sm3 =  new ScrumMaster(chatGeneral)
                .setCertificaciones("iso-7821").setCi("1726").setName("Paul");

        chatGeneral.addProfesionalToTheChat(dev1)
                .addProfesionalToTheChat(dev2)
                .addProfesionalToTheChat(dev3)
                .addProfesionalToTheChat(qa1)
                .addProfesionalToTheChat(qa2)
                .addProfesionalToTheChat(qa3)
                .addProfesionalToTheChat(sm1)
                .addProfesionalToTheChat(sm2)
                .addProfesionalToTheChat(sm3);

        chatQA.addProfesionalToTheChat(qa1)
                .addProfesionalToTheChat(qa2)
                .addProfesionalToTheChat(qa3);

        chatDev.addProfesionalToTheChat(dev1)
                .addProfesionalToTheChat(dev2)
                .addProfesionalToTheChat(dev3);


        qa1.send("Buenos dias a los QAs");
        dev3.send("Presente todos los DEVs");
        sm2.send("Bienvenidos todos!!!!");

    }

}
