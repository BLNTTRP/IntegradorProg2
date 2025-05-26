package Entities;

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, double precioVenta, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public Double getPrecioCompra() {return precioCompra;}

    public void setPrecioCompra(Double precioCompra) {this.precioCompra = precioCompra;}

    public int getStockActual() {return stockActual;}

    public void setStockActual(int stockActual) {this.stockActual = stockActual;}

    public int getStockMaximo() {return stockMaximo;}

    public void setStockMaximo(int stockMaximo) {this.stockMaximo = stockMaximo;}

    public Boolean getEsParaElaborar() {return esParaElaborar;}

    public void setEsParaElaborar(Boolean esParaElaborar) {this.esParaElaborar = esParaElaborar;}

}

