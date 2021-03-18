package restaurantProducts;

import productsСharacteristics.Vegetables;

public class Kohlrabi extends Vegetables {

    public  Kohlrabi (VegetablesTypes vegetablesTypes,String productName,
                      double priceKilo, double caloriePer100g){

        super (VegetablesTypes.CABBAGE_VEGETABLES, "kohlrabi", 4.7, 44.0);
    }
}