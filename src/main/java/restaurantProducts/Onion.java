package restaurantProducts;

import productsСharacteristics.Vegetables;

public class Onion extends Vegetables {

     public Onion (VegetablesTypes vegetablesTypes, String productName,
                   double priceKilo, double caloriePer100g,
                   double weightIngredientInDishesInGrams){

         super (VegetablesTypes.BULBOUS_VEGETABLES,"onion", 6.9, 41.0, 25);
    }
}
