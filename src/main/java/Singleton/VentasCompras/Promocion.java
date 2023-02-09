package Singleton.VentasCompras;

public class Promocion {
    private double descuento=0;
    public void setDescuento(double descuento) {
        this.descuento = descuento;
        LogFile.getInstance().writeLog("Se ha cambiado el valor del descuento a "+descuento+"%");
    }

    public double getDescuento() {
        return descuento;
    }
}
