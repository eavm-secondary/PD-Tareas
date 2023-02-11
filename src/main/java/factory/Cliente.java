package factory;

public class Cliente {
    public static void main(String[] args) {
        CreadorPasajeStandard creadorPasajeStandard = new CreadorPasajeStandard();

        PasajeStandard p1 = creadorPasajeStandard.create();
        PasajeStandard p2 = creadorPasajeStandard.create();

        p1.setPasajero(new Persona("Pedro Rodriguez","7893453"));
        p1.setNumeroAsiento(15);
        p2.setPasajero(new Persona("Alberto Sanchez","5769341"));
        p2.setNumeroAsiento(25);

        CreadorPasajeSolidario creadorPasajeSolidario = new CreadorPasajeSolidario();

        PasajeSolidario p3 = creadorPasajeSolidario.create();
        PasajeSolidario p4 = creadorPasajeSolidario.create();

        p3.setPasajero(new Persona("Jose Andres", "1234567"));
        p3.setNumeroAsiento(13);
        p4.setPasajero(new Persona("Luis Miguel", "4561234"));
        p4.setNumeroAsiento(11);

        CreadorPasajeInfante creadorPasajeInfante = new CreadorPasajeInfante();

        PasajeInfante p5 = creadorPasajeInfante.create();
        PasajeInfante p6 = creadorPasajeInfante.create();

        p5.setPasajero(new Persona("Andres Velasco", "2345671"));
        p5.setNumeroAsiento(91);
        p6.setPasajero(new Persona("Carlos Sucre", "2561230"));
        p6.setNumeroAsiento(92);

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();
        p6.showInfo();

    }
}
