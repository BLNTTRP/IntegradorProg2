package Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;

    private Localidad localidad;
    private Set<Cliente> clientes = new HashSet<>();
    private Set<Pedido> pedidos = new HashSet<>();


    public Domicilio(String calle, int numero, int cp, Localidad Albuqerque) {
       this.calle = calle;
       this.numero = numero;
       this.cp = cp;
       this.localidad = localidad;
    }
}
