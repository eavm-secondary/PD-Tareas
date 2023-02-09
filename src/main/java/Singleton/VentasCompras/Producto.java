package Singleton.VentasCompras;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        LogFile.getInstance().writeLog("Se ha creado el producto "+nombre+ " con un precio de "+precio+"Bs");
    }

    public void setNombre(String nombre) {
        LogFile.getInstance().writeLog("Se ha cambiado del nombre del producto "+this.nombre+" a "+nombre);
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        LogFile.getInstance().writeLog("Se ha cambiado el precio del producto "+this.nombre+" a "+precio+"Bs");
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
