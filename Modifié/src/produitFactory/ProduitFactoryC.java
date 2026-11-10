package produitFactory;

import produits.Produit;
import produits.ProduitC;

public class ProduitFactoryC extends ProduitFactory {

    @Override
    protected Produit createProduit() {
        Produit produit = new ProduitC();
        return produit;
    }

}
