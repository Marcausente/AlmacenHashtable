public class Producto {
    String nombre;
    int precio;
    int cantidad;

    public Producto(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString() {
        return "Producto: " + nombre + ", precio: ";
    }
}
