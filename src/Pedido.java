public class Pedido {
    private int numero;
    private String cliente;
    private double total;
    private String estado;
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente"; // Se establece automáticamente
    }
    // Método del Desafío: Confirmar pedido y sumar ventas totales sin duplicar
    public void confirmar() {
        if (!this.estado.equals("Confirmado")) {
            this.estado = "Confirmado";
            ventasTotales += this.total; // Suma el total a las ventas globales[cite: 1]
            System.out.println("El pedido #" + numero + " de " + cliente + " ha sido confirmado.");
        } else {
            System.out.println("El pedido #" + numero + " ya estaba confirmado anteriormente.");
        }
    }

    // Métodos estáticos para consultar las estadísticas globales
    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }

}
