package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Lettuce extends Vegetables {

    public Lettuce (VegetablesTypes vegetablesTypes, String productName,
                    double priceKilo, double caloriePer100g){

        super(VegetablesTypes.BULBOUS_VEGETABLES, "lettuce", 5.0, 9.2);
    }

}
