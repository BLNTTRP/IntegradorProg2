package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Usuario extends Base {
    private String authOId;
    private String username;

    private Cliente cliente;

    public Usuario(String s, String juanperez) {
        super();
    }
}

