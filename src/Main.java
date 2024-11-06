import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGestor sistema = new SistemaGestor();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Afegir producte");
            System.out.println("2. Eliminar producte");
            System.out.println("3. Consultar producte");
            System.out.println("4. Llistar productes");
            System.out.println("5. Actualitzar quantitat en estoc");
            System.out.println("6. Sortir");
            System.out.print("Selecciona una opció: ");
            int opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Nom del producte: ");
                    String nom = scanner.nextLine();
                    System.out.print("Preu del producte: ");
                    int preu = scanner.nextInt();
                    System.out.print("Quantitat en estoc: ");
                    int quantitat = scanner.nextInt();
                    scanner.nextLine();
                    Producto producte = new Producto(nom, preu, quantitat);
                    sistema.addProduct(producte);
                    break;

                case 2:
                    System.out.print("Nom del producte a eliminar: ");
                    String nomEliminar = scanner.nextLine();
                    sistema.deleteProduct(nomEliminar);
                    break;

                case 3:
                    System.out.print("Nom del producte a consultar: ");
                    String nomConsultar = scanner.nextLine();
                    sistema.consultProduct(nomConsultar);
                    break;

                case 4:
                    sistema.ProductList();
                    break;

                case 5:
                    System.out.print("Nom del producte a actualitzar: ");
                    String nomActualitzar = scanner.nextLine();
                    System.out.print("Nova quantitat: ");
                    int novaQuantitat = scanner.nextInt();
                    sistema.updateProduct(nomActualitzar, novaQuantitat);
                    break;

                case 6:
                    continuar = false;
                    System.out.println("Saliendo. ¡Gracias por utilizar!");
                    break;

                default:
                    System.out.println("Opció no vàlida, intenta de nou.");
            }
        }

        scanner.close();
    }
}
