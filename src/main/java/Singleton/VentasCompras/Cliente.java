package Singleton.VentasCompras;

import java.util.Calendar;
import java.util.Date;

public class Cliente {
    private String nombre;

    public static void main(String[] args) {
        Cliente user1 = new Cliente("Enrique");
        Producto prod1 = new Producto("Iphone 15", 20000);
        Producto prod2 = new Producto("Televisor Samsung", 1500);
        Producto prod3 = new Producto("Pilfrut", 1);

        Factura factura1 = user1.comprar(prod1);
        factura1.emitirFactura();

        Factura factura2 = user1.comprar(prod3);
        factura2.actualizarDescuento(0.2);
        factura2.emitirFactura();
    }

    public Cliente(String nombre){
        this.nombre = nombre;
        LogFile.getInstance().writeLog("Se ha creado el usuario con nombre: "+nombre);
    }

    public Factura comprar(Producto producto){
        LogFile.getInstance().writeLog("El usuario "+nombre+" compró el producto "+producto);
        return new Factura(this, producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        LogFile.getInstance().writeLog("Se ha cambiado el nombre del usuario "+this+" a "+nombre);
        this.nombre = nombre;
    }
}
