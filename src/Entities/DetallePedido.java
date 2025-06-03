package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

    public DetallePedido(int cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.subTotal = cantidad * articulo.getPrecioVenta();
    }


}
