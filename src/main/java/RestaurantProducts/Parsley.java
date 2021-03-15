package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Parsley extends Vegetables {

    public Parsley (VegetablesTypes vegetablesTypes, String productName,
                 double priceKilo, double caloriePer100g){

        super(VegetablesTypes.ROOT_VEGETABLES, "parsley", 7.0, 14.3);
    }
}