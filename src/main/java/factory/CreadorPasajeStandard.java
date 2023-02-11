package factory;

public class CreadorPasajeStandard extends CreadorPasaje{
    @Override
    public PasajeStandard create() {
        PasajeStandard pasaje = new PasajeStandard();
        pasaje.setCostoPasaje(100);
        pasaje.setAvion(new Avion("Boa","F17",200,200));
        pasaje.setOrigen(new Aeropuerto("Bolivia","Santa Cruz","Viru Viru"));
        pasaje.setDestino(new Aeropuerto("Bolivia","La Paz","Aeropuerto Internacional"));
        pasaje.setNumeroAsiento(0);
        pasaje.setNumeroVuelo("BF59");
        return pasaje;
    }
}
