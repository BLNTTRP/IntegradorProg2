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

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    private Set<Promocion> promociones = new HashSet<>();
    private Set<Imagen> imagenes = new HashSet<>();
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }
}
