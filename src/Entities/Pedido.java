package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;
import Enum.TipoEnvio;
import Enum.Estado;
import Enum.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Pedido extends Base {
    private Estado estado;
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Factura factura;
    private Set<DetallePedido> detallePedido = new HashSet<>();

    public Pedido(LocalDate fechaPedido, FormaPago formaPago, TipoEnvio tipoEnvio) {
        this.fechaPedido = fechaPedido;
        this.formaPago = formaPago;
        this.tipoEnvio = tipoEnvio;
        this.estado = Estado.PENDIENTE;
        this.horaEstimadaFinalizacion = LocalTime.now().plusMinutes(30); // simulación
    }

    public void agregarDetalle(DetallePedido detalle) {
        this.detallePedido.add(detalle);
        total += detalle.getSubTotal();
    }
}
