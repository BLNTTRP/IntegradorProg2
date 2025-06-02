package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private Boolean esParaElaborar;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public ArticuloInsumo(String pan, int i, int i1, int i2, int i3, boolean b) {
    }
}

