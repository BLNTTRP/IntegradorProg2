import Entities.*;
import Enum.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Pais argentina = new Pais("Argentina");
        Provincia mendoza = new Provincia("Mendoza", argentina);
        Localidad godoyCruz = new Localidad("Godoy Cruz", mendoza);

        Domicilio domicilioSucursal = new Domicilio("San Martín", 123, 5501, godoyCruz);

        Sucursal sucursal = new Sucursal("Sucursal Centro", LocalTime.of(9, 0), LocalTime.of(20, 0), domicilioSucursal);

        Empresa empresa = new Empresa("Buen Sabor S.A.", "Buen Sabor Sociedad Anónima", 30567891234L);
        empresa.getSucursales().add(sucursal);


        System.out.println("Empresa: " + empresa.getNombre() + " - CUIL: " + empresa.getCuil());
        System.out.println("Sucursal: " + sucursal.getNombre() + " - Dirección: " + domicilioSucursal.getCalle() + " " + domicilioSucursal.getNumero());

        Usuario usuarioCliente = new Usuario("auth0|abc123", "juanperez");

        Cliente cliente = new Cliente(
            "Juan",
            "Pérez",
            "2614567890",
            "juan.perez@email.com",
            LocalDate.of(1995, 5, 20),
            usuarioCliente
        );

        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Usuario: " + cliente.getUsuario().getUsername());

        // Crear un artículo
        ArticuloManufacturado hamburguesa = new ArticuloManufacturado(
            "Hamburguesa Completa", 2500.0,
            "Pan, carne, lechuga, tomate y cheddar", 15,
            "Cocinar la carne y armar la hamburguesa"
        );

// Crear detalle del pedido
        DetallePedido detalle = new DetallePedido(2, hamburguesa); // 2 unidades

// Crear pedido
        Pedido pedido = new Pedido(LocalDate.now(), cliente, FormaPago.MERCADOPAGO, TipoEnvio.DELIVERY);
        pedido.agregarDetalle(detalle);

// Crear factura
        Factura factura = new Factura(LocalDate.now(), FormaPago.MERCADOPAGO, pedido.getTotal());

// Mostrar pedido y factura por consola
        System.out.println("Pedido de: " + cliente.getNombre());
        System.out.println("Total pedido: $" + pedido.getTotal());
        System.out.println("Factura total: $" + factura.getTotalVenta());
    }
}

