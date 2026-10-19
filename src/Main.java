//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //--- PRUEBA PRACTICA ND3.1 PRODUCTOS ---
        Producto p1 = new Producto("Mouse", 25.50, 10);
        Producto p2 = new Producto("Teclado", 45.00, 15);
        Producto p3 = new Producto("Monitor", 150.00, 5);
        Producto p4 = new Producto("Audifonos", 30.00, 20);
        Producto p5 = new Producto("Webcam", 60.00, 8);

        System.out.println("Total de productos: " + Producto.getContadorProductos());



    // --- PRUEBA PRÁCTICA ND3.2 (CLIENTES) ---
    Cliente c1 = new Cliente("Ana Pérez", "ana@correo.com");
    Cliente c2 = new Cliente("Luis Gómez", "luis@correo.com");

c1.desactivar(); // Probamos desactivarlo
c2.activar();  // Lo volvemos a activar

System.out.println("Total de clientes: " + Cliente.getTotalClientes());


// --- PRUEBA PRÁCTICA ND3.3 (PEDIDOS) ---

        Pedido p6 = new Pedido("Carlos", 120.50);
        Pedido p7 = new Pedido("María", 80.00);

        p6.confirmar(); // Confirma y suma 120.50 a las ventas totales[cite: 1]
        p7.confirmar(); // Intento duplicado (debe advertir que ya está confirmado)[cite: 1]

        System.out.println("Total de pedidos: " + Pedido.getContadorPedidos());
        System.out.println("Ventas totales: $" + Pedido.getVentasTotales());

    }
}
