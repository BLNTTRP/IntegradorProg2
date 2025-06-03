package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class ArticuloManufacturadoDetalle extends Base {
    private ArticuloInsumo insumo;
    private int cantidad;

    public ArticuloManufacturadoDetalle(ArticuloInsumo insumo, int cantidad) {
        this.insumo = insumo;
        this.cantidad = cantidad;
    }
}

