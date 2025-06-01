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

public class Categoria extends Base{
    private String denominacion;

    private Set<Sucursal> sucursales = new HashSet<>();

}
