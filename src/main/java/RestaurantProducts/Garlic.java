package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Garlic extends Vegetables {

    public Garlic (VegetablesTypes vegetablesTypes,String productName,
            double priceKilo, double caloriePer100g){

        super(VegetablesTypes.BULBOUS_VEGETABLES, "garlic", 9.39, 149.0);
    }
}
