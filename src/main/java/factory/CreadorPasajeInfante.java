package factory;

public class CreadorPasajeInfante extends CreadorPasaje{
    @Override
    public PasajeInfante create() {
        PasajeInfante pasaje = new PasajeInfante();
        pasaje.setCostoEspecial(80);
        pasaje.setAvion(new Avion("Boa","F17",200,200));
        pasaje.setOrigen(new Aeropuerto("Bolivia","Santa Cruz","Viru Viru"));
        pasaje.setDestino(new Aeropuerto("Bolivia","La Paz","Aeropuerto Internacional"));
        pasaje.setNumeroAsiento(0);
        pasaje.setNumeroVuelo("BF59");
        return pasaje;
    }
}
