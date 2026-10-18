public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private boolean activo;
    private static int contadorClientes = 0;

    public Cliente(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true; // Por defecto nace activo
    }
    // Método para activar al cliente
    public void activar() {
        this.activo = true;
        System.out.println("El cliente " + nombre + " ha sido activado.");
    }
        // Método para desactivar al cliente
        public void desactivar() {
            this.activo = false;
            System.out.println("El cliente " + nombre + " ha sido desactivado.");
        }

    // Método estático para consultar el total de clientes creados
    public static int getTotalClientes() {
        return contadorClientes;
    }


}
