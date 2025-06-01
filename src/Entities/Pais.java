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

public class Pais extends Base {
    private String nombre;

    private Set<Provincia> provincias = new HashSet<>();


    public Pais(String argentina) {
        super();
    }
}
