package Entities;

//import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private String preparacion;
    private int tiempoEstimadoEnMinutos;

    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

    public ArticuloManufacturado(String hamburguesaCompleta, double v, String s, int i, String s1) {
    }

    public void setUnidadMedida(UnidadMedida unidad) {
    }

    public void setCategoria(Categoria categoria) {

    }
}
