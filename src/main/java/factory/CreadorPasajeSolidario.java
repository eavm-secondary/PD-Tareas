package factory;

public class CreadorPasajeSolidario extends CreadorPasaje{
    @Override
    public PasajeSolidario create() {
        PasajeSolidario pasaje = new PasajeSolidario();
        pasaje.setCostoPasaje(100);
        pasaje.setAvion(new Avion("Boa","F17",200,200));
        pasaje.setOrigen(new Aeropuerto("Bolivia","Santa Cruz","Viru Viru"));
        pasaje.setDestino(new Aeropuerto("Bolivia","La Paz","Aeropuerto Internacional"));
        pasaje.setNumeroAsiento(0);
        pasaje.setNumeroVuelo("BF59");
        pasaje.setDescuento(20.5);
        pasaje.setMotivoDelDescuento("Tercera Edad");
        return pasaje;
    }
}
