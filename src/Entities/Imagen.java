package Entities;

public class Imagen extends Base {
    private String denominacion;

    public Imagen (String denomination) {
        this.denominacion = denomination;
    }

    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}
}
