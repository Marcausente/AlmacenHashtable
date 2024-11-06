import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGestor sistema = new SistemaGestor();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añade un producto");
            System.out.println("2. Elimina un producto");
            System.out.println("3. Consulta un producto");
            System.out.println("4. Lista de productos");
            System.out.println("5. Actualiza las cantidades de stock");
            System.out.println("6. Sortir");
            System.out.print("Selecciona una opció: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nombre producto: ");
                    String nom = scanner.nextLine();
                    System.out.print("Precio de producto: ");
                    int precio = scanner.nextInt();
                    System.out.print("Cantidad de producto: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    Producto producto = new Producto(nom, precio, cantidad);
                    sistema.addProduct(producto);
                    break;

                case 2:
                    System.out.print("Nombre del producto a añadir: ");
                    String nombreEliminar = scanner.nextLine();
                    sistema.deleteProduct(nombreEliminar);
                    break;

                case 3:
                    System.out.print("Nombre del producto a consultar: ");
                    String nombreConsultar = scanner.nextLine();
                    sistema.consultProduct(nombreConsultar);
                    break;

                case 4:
                    sistema.ProductList();
                    break;

                case 5:
                    System.out.print("Nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("Nueva cuantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    sistema.updateProduct(nombreActualizar, nuevaCantidad);
                    break;

                case 6:
                    continuar = false;
                    System.out.println("Saliendo. ¡Gracias por utilizar!");
                    break;

                default:
                    System.out.println("Numero introducido no valido");
            }
        }

        scanner.close();
    }
}
