package RestaurantProducts;

import ProductsСharacteristics.Vegetables;

public class Onion extends Vegetables {

     public Onion (VegetablesTypes vegetablesTypes, String productName,
                  double priceKilo, double caloriePer100g){

         super (VegetablesTypes.BULBOUS_VEGETABLES, "onion", 6.9, 41.0);
    }
}
