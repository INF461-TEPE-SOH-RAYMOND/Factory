package produitFactory;

import produits.Produit;
import produits.ProduitB;

public class ProduitFactoryB extends ProduitFactory {

    @Override
    protected Produit createProduit() {
        Produit produit = new ProduitB();
        return produit;
    }

}
