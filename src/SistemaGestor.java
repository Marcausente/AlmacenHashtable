import java.util.Hashtable;

public class SistemaGestor {
    private Hashtable<String, Producto> productes;

    public SistemaGestor() {
        productes = new Hashtable<>();
    }

    public void addProduct(Producto producte) {
        if (productes.containsKey(producte.getNombre())) {
            System.out.println("Error: El producte ja existeix.");
        } else {
            productes.put(producte.getNombre(), producte);
            System.out.println("Producte afegit: " + producte.getNombre());
        }
    }

    public void deleteProduct(String nom) {
        if (productes.containsKey(nom)) {
            productes.remove(nom);
            System.out.println("Producte eliminat: " + nom);
        } else {
            System.out.println("Producte no trobat: " + nom);
        }
    }

    public void consultProduct(String nom) {
        if (productes.containsKey(nom)) {
            Producto producte = productes.get(nom);
            System.out.println(producte);
        } else {
            System.out.println("Producte no trobat: " + nom);
        }
    }

    public void ProductList() {
        if (productes.isEmpty()) {
            System.out.println("No hi ha productes en el sistema.");
        } else {
            System.out.println("Llista de productes:");
            for (Producto producte : productes.values()) {
                System.out.println(producte);
            }
        }
    }

    public void updateProduct(String nom, int novaQuantitat) {
        if (productes.containsKey(nom)) {
            Producto producte = productes.get(nom);
            producte.cantidad = novaQuantitat;
            System.out.println("Quantitat actualitzada per al producte: " + nom + " a " + novaQuantitat);
        } else {
            System.out.println("Producte no trobat per actualitzar: " + nom);
        }
    }
}
