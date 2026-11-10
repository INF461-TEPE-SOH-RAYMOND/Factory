import produitFactory.ProduitFactory;
import produitFactory.ProduitFactoryA;
import produitFactory.ProduitFactoryB;
import produitFactory.ProduitFactoryC;
import produitFactory.ProduitFactoryD;
import produits.Produit;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        System.out.println("Methode 2");

        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        ProduitFactory produitFactoryD = new ProduitFactoryD();

        Produit produit = null;
        
        produit = produitFactoryA.getProduit();
        produit.methodeProduit();

        produit = produitFactoryB.getProduit();
        produit.methodeProduit();
        
        produit = produitFactoryC.getProduit();
        produit.methodeProduit();

        produit = produitFactoryD.getProduit();
        produit.methodeProduit();
    }   
}
