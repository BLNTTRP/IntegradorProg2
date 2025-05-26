package Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import Enum.TipoEnvio;
import Enum.Estado;
import Enum.FormaPago;

public class Pedido extends Base {
    private Estado estado;
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Factura factura;

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, Estado estado, TipoEnvio tipoEnvio,
                  FormaPago formaPago, LocalDate fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
    }

    public LocalTime getHoraEstimadaFinalizacion() {return horaEstimadaFinalizacion;}

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;}

    public double getTotal() {return total;}

    public void setTotal(double total) {this.total = total;}

    public double getTotalCosto() {return totalCosto;}

    public void setTotalCosto(double totalCosto) {this.totalCosto = totalCosto;}

    public Estado getEstado() {return estado;}

    public void setEstado(Estado estado) {this.estado = estado;}

    public TipoEnvio getTipoEnvio() {return tipoEnvio;}

    public void setTipoEnvio(TipoEnvio tipoEnvio) {this.tipoEnvio = tipoEnvio;}

    public FormaPago getFormaPago() {return formaPago;}

    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public LocalDate getFechaPedido() {return fechaPedido;}

    public void setFechaPedido(LocalDate fechaPedido) {this.fechaPedido = fechaPedido;}

    public Factura getFactura() {return factura;}

    public void setFactura(Factura factura) {this.factura = factura;}

}
