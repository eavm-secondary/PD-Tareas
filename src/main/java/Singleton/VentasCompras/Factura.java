package Singleton.VentasCompras;

public class Factura {
    private Cliente cliente;
    private Producto producto;
    private Promocion promocion = new Promocion();

    public Factura(Cliente cliente, Producto producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public void actualizarDescuento(double descuento){
        promocion.setDescuento(descuento);
    }

    public void emitirFactura(){
        LogFile.getInstance().writeLog("Se ha emitido una factura para el cliente "+cliente.getNombre()+" que compró el producto "+producto.getNombre()+" con un precio total de: "+producto.getPrecio()*(1-promocion.getDescuento()));
    }
}
