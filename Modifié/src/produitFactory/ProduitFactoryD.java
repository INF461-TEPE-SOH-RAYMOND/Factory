package produitFactory;

import produits.Produit;
import produits.ProduitD;

public class ProduitFactoryD extends ProduitFactory {

    @Override
    protected Produit createProduit() {
        Produit produit = new ProduitD();
        return produit;
    }

}
