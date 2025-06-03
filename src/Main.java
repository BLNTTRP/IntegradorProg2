import Entities.*;
import Enum.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Pais Estados_Unidos = new Pais("Estados Unidos");
        Provincia Nuevo_Mexico = new Provincia("Nuevo Mexico", Estados_Unidos);
        Localidad Albuquerque = new Localidad("Albuquerque", Nuevo_Mexico);

        Domicilio domicilioSucursal = new Domicilio("Negra Arroyo Lane", 123, 5501, Albuquerque);

        Sucursal sucursal = new Sucursal("Sucursal Centro", LocalTime.of(9, 0), LocalTime.of(20, 0), domicilioSucursal);

        Empresa empresa = new Empresa("Buen Sabor S.A.", "Buen Sabor Sociedad Anónima", 30567891234L);
        empresa.getSucursales().add(sucursal);


        System.out.println("Empresa: " + empresa.getNombre() + " - CUIL: " + empresa.getCuil());
        System.out.println("Sucursal: " + sucursal.getNombre() + " - Dirección: " + domicilioSucursal.getCalle() + " " + domicilioSucursal.getNumero());

        Usuario usuarioCliente = new Usuario("auth0|abc123", "Walter White");

        Cliente cliente = new Cliente(
            "Walter",
            "White",
            "2614567890",
            "Walter.White@email.com",
            LocalDate.of(1995, 5, 20),
            usuarioCliente
        );
 
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Usuario: " + cliente.getUsuario().getUsername());

        ArticuloManufacturado hamburguesa = new ArticuloManufacturado(
            "Hamburguesa Completa", 2500.0,
            "Pan, carne, lechuga, tomate y cheddar", 15,
            "Cocinar la carne y armar la hamburguesa"
        );

        DetallePedido detalle = new DetallePedido(2, hamburguesa); // 2 unidades

        Pedido pedido = new Pedido(LocalDate.now(), cliente, FormaPago.MERCADOPAGO, TipoEnvio.DELIVERY);
        pedido.agregarDetalle(detalle);

        Factura factura = new Factura(LocalDate.now(), FormaPago.MERCADOPAGO, pedido.getTotal());

        System.out.println("Pedido de: " + cliente.getNombre());
        System.out.println("Total pedido: $" + pedido.getTotal());
        System.out.println("Factura total: $" + factura.getTotalVenta());


        UnidadMedida unidad = new UnidadMedida("unidad");

        Categoria categoria = new Categoria("Comidas Rápidas");

        Imagen imagen = new Imagen("hamburguesa.png");


        ArticuloInsumo pan = new ArticuloInsumo("Pan", 200, 100, 100, 200, false);
        ArticuloInsumo carne = new ArticuloInsumo("Carne", 500, 300, 100, 150, true);
        ArticuloInsumo cheddar = new ArticuloInsumo("Cheddar", 300, 150, 100, 150, false);


        ArticuloManufacturadoDetalle detPan = new ArticuloManufacturadoDetalle(pan, 1);
        ArticuloManufacturadoDetalle detCarne = new ArticuloManufacturadoDetalle(carne, 1);
        ArticuloManufacturadoDetalle detCheddar = new ArticuloManufacturadoDetalle(cheddar, 1);


        hamburguesa.getDetalles().add(detPan);
        hamburguesa.getDetalles().add(detCarne);
        hamburguesa.getDetalles().add(detCheddar);
        hamburguesa.getImagenes().add(imagen);
        hamburguesa.setUnidadMedida(unidad);
        hamburguesa.setCategoria(categoria);

        Promocion promo = new Promocion(
                "Promo 2x1 Hamburguesa",
                LocalDate.now(),
                LocalDate.now().plusDays(30),
                LocalTime.of(18, 0),
                LocalTime.of(20, 0),
                "2x1 en hamburguesas",
                2500.0,
                TipoPromocion.HAPPY_HOUR
        );
        promo.getArticulos().add(hamburguesa);
    }
}

