public class Producto {
    //atributos privados
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos=0;

    //constructor requerido
    public Producto(String nombre, double precion, int stock){
        contadorProductos++;
        this.id= contadorProductos;
        this.nombre = nombre;
        this.precio= precio;
        this.stock= stock;
    }
    //METODO STATIC para consultar el total de productos creados
    public static int getContadorProductos(){
        return contadorProductos;

    }

}
