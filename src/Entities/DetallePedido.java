package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;

    public DetallePedido(int cantidad, ArticuloManufacturado hamburguesa) {
        super();
    }
}
