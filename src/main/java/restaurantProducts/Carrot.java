package restaurantProducts;

import productsСharacteristics.Vegetables;

public class Carrot extends Vegetables {

    public Carrot (VegetablesTypes vegetablesTypes, String productName,
                   double priceKilo, double caloriePer100g,
                   double weightIngredientInDishesInGrams){

        super(VegetablesTypes.ROOT_VEGETABLES, "carrot", 2.4, 35, 50);
    }
}