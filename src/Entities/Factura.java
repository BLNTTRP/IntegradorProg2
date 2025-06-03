package Entities;

import java.time.LocalDate;
import Enum.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    private Pedido pedido;

    public Factura(LocalDate fechaFacturacion, FormaPago formaPago, double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
        this.mpPaymentId = 1234;
        this.mpMerchantOrderId = 5678;
        this.mpPreferenceId = "MP-XYZ-001";
        this.mpPaymentType = "credit_card";
    }

}
