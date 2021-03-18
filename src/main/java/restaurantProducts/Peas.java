package restaurantProducts;

import productsСharacteristics.Vegetables;

public class Peas extends Vegetables {

    public Peas (VegetablesTypes vegetablesTypes, String productName,
                  double priceKilo, double caloriePer100g){

        super(VegetablesTypes.LEGUMES_VEGETABLES, "peas", 2.7, 37.0);
    }
}