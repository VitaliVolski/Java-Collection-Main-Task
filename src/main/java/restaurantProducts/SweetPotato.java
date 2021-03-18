package restaurantProducts;

import productsСharacteristics.Vegetables;

public class SweetPotato extends Vegetables{

    public SweetPotato (VegetablesTypes vegetablesTypes, String productName,
                     double priceKilo, double caloriePer100g){

        super(VegetablesTypes.TUBES_VEGETABLES, "sweetPotato", 4.3, 85.0);
    }
}

