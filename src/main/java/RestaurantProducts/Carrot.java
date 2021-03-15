package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Carrot extends Vegetables {

    public Carrot (VegetablesTypes vegetablesTypes, String productName,
                    double priceKilo, double caloriePer100g){

        super(VegetablesTypes.ROOT_VEGETABLES, "carrot", 2.4, 35);
    }
}