package Entities;

//import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

@Getter
@Setter

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private String preparacion;
    private int tiempoEstimadoEnMinutos;

    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();
    private UnidadMedida unidadMedida;
    private Categoria categoria;

    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, int tiempoEstimadoEnMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoEnMinutos = tiempoEstimadoEnMinutos;
        this.preparacion = preparacion;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
