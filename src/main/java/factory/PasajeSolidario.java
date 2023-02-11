package factory;

public class PasajeSolidario implements IPasaje{
    private String numeroVuelo;
    private Aeropuerto destino;
    private Aeropuerto origen;
    private Avion avion;
    private Persona pasajero;
    private int numeroAsiento;
    private double costoPasaje;
    private double descuento;
    private String motivoDelDescuento;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDelDescuento() {
        return motivoDelDescuento;
    }

    public void setMotivoDelDescuento(String motivoDelDescuento) {
        this.motivoDelDescuento = motivoDelDescuento;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Persona getPasajero() {
        return pasajero;
    }

    public void setPasajero(Persona pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(double costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    @Override
    public void showInfo() {
        System.out.println("Pasajero:");
        pasajero.showInfo();
        System.out.println("Origen:");
        origen.showInfo();
        System.out.println("Destino:");
        destino.showInfo();
        System.out.println("Avion:");
        avion.showInfo();
        System.out.println("Numero de vuelo: "+numeroVuelo);
        System.out.println("Numero de asiento: "+numeroAsiento);
        System.out.println("Costo de pasaje: "+costoPasaje);
        System.out.println("Descuento: "+descuento);
        System.out.println("Motivo del Descuento: "+motivoDelDescuento);
        System.out.println("**************************************");

    }
}
