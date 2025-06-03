package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Usuario extends Base {
    private String authOId;
    private String username;

    private Cliente cliente;

    public Usuario(String authOId, String username) {
        this.authOId = authOId;
        this.username = username;
    }
}

