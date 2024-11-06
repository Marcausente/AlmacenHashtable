import java.util.Hashtable;

public class SistemaGestor {
    private Hashtable<String, Producto> productes;

    public SistemaGestor() {
        productes = new Hashtable<>();
    }

    public void addProduct(Producto producte) {
        if (productes.containsKey(producte.getNombre())) {
            System.out.println("El producto ya existe");
        } else {
            productes.put(producte.getNombre(), producte);
            System.out.println("¡Producto añadido! " + producte.getNombre());
        }
    }

    public void deleteProduct(String nom) {
        if (productes.containsKey(nom)) {
            productes.remove(nom);
            System.out.println("Producto eliminado: " + nom);
        } else {
            System.out.println("Producto no encontrado: " + nom);
        }
    }

    public void consultProduct(String nom) {
        if (productes.containsKey(nom)) {
            Producto producto = productes.get(nom);
            System.out.println(producto);
        } else {
            System.out.println("Producte no trobat: " + nom);
        }
    }

    public void ProductList() {
        if (productes.isEmpty()) {
            System.out.println("No tenemos productos almacenados, una pena");
        } else {
            System.out.println("Lista completa de todos los productos");
            for (Producto producte : productes.values()) {
                System.out.println(producte);
            }
        }
    }

    public void updateProduct(String nom, int novaQuantitat) {
        if (productes.containsKey(nom)) {
            Producto producte = productes.get(nom);
            producte.cantidad = novaQuantitat;
            System.out.println("Cantidad actualizada por producto: " + nom + " a " + novaQuantitat);
        } else {
            System.out.println("No hemos encontrado el producto que quieres actualizar: : " + nom);
        }
    }
}
