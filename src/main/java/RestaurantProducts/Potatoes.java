package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Potatoes extends Vegetables {

    public Potatoes (VegetablesTypes vegetablesTypes, String productName,
                     double priceKilo, double caloriePer100g){

        super(VegetablesTypes.TUBES_VEGETABLES, "potatoes", 1.5, 77.0);
    }
}
