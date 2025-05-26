package Entities;

import java.time.LocalDate;
import Enum.FormaPago;

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    public Factura(LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String mpPreferenceId,
                   String mpPaymentType, FormaPago formaPago, double totalVenta, double totalVenta1,
                   int mpPaymentId1, int mpMerchantOrderId1, String mpPreferenceId1, String mpPaymentType1, FormaPago formaPago1) {
        this.fechaFacturacion = fechaFacturacion;
        this.totalVenta = totalVenta;
        this.mpPaymentId = mpPaymentId1;
        this.mpMerchantOrderId = mpMerchantOrderId1;
        this.mpPreferenceId = mpPreferenceId1;
        this.mpPaymentType = mpPaymentType1;
        this.formaPago = formaPago;
    }

    public LocalDate getFechaFacturacion() {return fechaFacturacion;}

    public void setFechaFacturacion(LocalDate fechaFacturacion) {this.fechaFacturacion = fechaFacturacion;}

    public int getMpPaymentId() {return mpPaymentId;}

    public void setMpPaymentId(int mpPaymentId) {this.mpPaymentId = mpPaymentId;}

    public int getMpMerchantOrderId() {return mpMerchantOrderId;}

    public void setMpMerchantOrderId(int mpMerchantOrderId) {this.mpMerchantOrderId = mpMerchantOrderId;}

    public String getMpPreferenceId() {return mpPreferenceId;}

    public void setMpPreferenceId(String mpPreferenceId) {this.mpPreferenceId = mpPreferenceId;}

    public String getMpPaymentType() {return mpPaymentType;}

    public void setMpPaymentType(String mpPaymentType) {this.mpPaymentType = mpPaymentType;}

    public FormaPago getFormaPago() {return formaPago;}

    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public double getTotalVenta() {return totalVenta;}

    public void setTotalVenta(double totalVenta) {this.totalVenta = totalVenta;}
}
