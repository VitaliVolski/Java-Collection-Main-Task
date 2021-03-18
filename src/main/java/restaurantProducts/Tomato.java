package restaurantProducts;

import productsСharacteristics.Vegetables;

public class Tomato extends Vegetables {

    public Tomato(VegetablesTypes vegetablesTypes, String productName,
                  double priceKilo, double caloriePer100g,
                  double weightIngredientInDishesInGrams){

        super(VegetablesTypes.TOMATO_VEGETABLES, "tomato", 3.25, 24.0, 100);
    }
}
