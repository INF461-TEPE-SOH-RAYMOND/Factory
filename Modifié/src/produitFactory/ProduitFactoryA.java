package produitFactory;

import produits.Produit;
import produits.ProduitA;

public class ProduitFactoryA extends ProduitFactory {

    @Override
    protected Produit createProduit() {
        Produit produit = new ProduitA();
        return produit;
    }

}
