package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Categoria extends Base {
    private String denominacion;

    private Categoria categoriaPadre;
    private Set<Categoria> subcategorias = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();
}
