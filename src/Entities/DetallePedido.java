package Entities;

public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;
    private Pedido pedido;

    public DetallePedido(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public double getSubTotal() {return subTotal;}

    public void setSubTotal(double subTotal) {this.subTotal = subTotal;}

    public Articulo getArticulos() {return articulo;}

    public void setArticulos(Articulo articulos) {this.articulo = articulos;}

    public Pedido getPedido() {return pedido;}

    public void setPedido(Pedido pedido) {this.pedido = pedido;}
}
