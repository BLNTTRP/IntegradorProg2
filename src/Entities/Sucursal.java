package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;
    private Set<Categoria> categorias = new HashSet<>();
    private Set<Promocion> promociones = new HashSet<>();

    public Sucursal(String sucursalCentro, LocalTime of, LocalTime of1, Domicilio domicilioSucursal) {
        super();
    }
}
