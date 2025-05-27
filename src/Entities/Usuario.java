package Entities;

public class Usuario extends Base {
    private String authOId;
    private String username;
    private Cliente cliente;

    public Usuario(String authOId, String username) {
        this.authOId = authOId;
        this.username = username;
    }

    public String getAuthOId() {return authOId;}

    public void setAuthOId(String authOId) {this.authOId = authOId;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}
}

