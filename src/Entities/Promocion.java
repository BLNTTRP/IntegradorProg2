package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;
import Enum.TipoPromocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Sucursal> sucursales = new HashSet<>();
    private Set<Imagen> imagenes = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();

    public Promocion(String s, LocalDate now, LocalDate localDate, LocalTime of, LocalTime of1, String s1, double v,
                     TipoPromocion tipoPromocion) {
        super();
    }
}

