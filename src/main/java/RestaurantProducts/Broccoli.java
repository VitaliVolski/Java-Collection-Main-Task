package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Broccoli extends Vegetables {

    public Broccoli (VegetablesTypes vegetablesTypes,String productName,
                      double priceKilo, double caloriePer100g){

        super (VegetablesTypes.CABBAGE_VEGETABLES, "broccoli", 5.32, 34.6);
    }
}
