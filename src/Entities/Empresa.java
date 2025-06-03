package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

@Getter
@Setter

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuit;

    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa(String nombre, String razonSocial, int cuit ) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

}
