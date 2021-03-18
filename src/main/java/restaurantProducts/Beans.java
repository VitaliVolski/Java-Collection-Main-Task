package restaurantProducts;

import productsСharacteristics.Vegetables;

import java.util.ArrayList;

public class Beans extends Vegetables {

    public Beans (VegetablesTypes vegetablesTypes, String productName,
                  double priceKilo, double caloriePer100g){

        super(VegetablesTypes.LEGUMES_VEGETABLES, "beans", 2.3, 37.0);
    }
}
