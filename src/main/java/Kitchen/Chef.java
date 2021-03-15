package Kitchen;

import ProductsСharacteristics.Vegetables;
import RestaurantProducts.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Chef {

    ArrayList<Salad> dietSalad = new ArrayList<>();

    public Chef createDietSalad() {

        dietSalad.add(new Salad("Diet-Salad", new Onion
                (VegetablesTypes.BULBOUS_VEGETABLES,"onion", 6.9, 41.0), 25));
        dietSalad.add(new Salad("Diet-Salad", new Tomato
                (VegetablesTypes.TOMATO_VEGETABLES,"tomato", 3.25, 24.0), 100));
        dietSalad.add(new Salad("Diet-Salad", new Broccoli
                (VegetablesTypes.CABBAGE_VEGETABLES, "broccoli", 5.32, 34.6), 50));
        dietSalad.add(new Salad("Diet-Salad", new Carrot
                (VegetablesTypes.ROOT_VEGETABLES, "carrot", 2.4, 35.0), 50));

        System.out.println("\nCreate salad from the existing ingredients. "
                + "It's named: Diet-Salad, and consist of:");
        for (Salad salad : dietSalad) {
            System.out.println(salad.getVegetables().getVegetableName()
                    + "," + salad.getWeightIngredientInDishesInGrams() + " gm.");
        }
        return this;
    }

    public Chef countSaladCalories() {

        double caloriesCount = 0.0;
        for (Salad salad : dietSalad) {
            caloriesCount += (salad.getWeightIngredientInDishesInGrams()
                    * salad.getVegetables().getCaloriePer100g() / 100);
        }
        System.out.println("\nSum calories in Diet-Salad = " + caloriesCount + " calories");
        return  this;
    }

    public Chef sortSaladByWeightSaladIngredientsInDishes() {

        System.out.println("\nSort saladIngredients by their weight in dishes:");
        dietSalad.sort(Comparator.comparing
                (Salad::getWeightIngredientInDishesInGrams));
        for (Salad salad : dietSalad) {
            System.out.println(salad.getVegetables().getVegetableName() + " - "
                    + salad.getWeightIngredientInDishesInGrams() + " gm.");
        }
        return this;
    }

    public Chef sortSaladIngredient() {

    System.out.println("\nFind vegetables in setting calories range (20.0 ; 35.0):");
        for (Salad salad : dietSalad) {
            if (salad.getVegetables().getCaloriePer100g() >= 20.0
                    && salad.getVegetables().getCaloriePer100g() <= 35.0) {
                System.out.println(salad.getVegetables().getVegetableName() + " - "
                        + salad.getVegetables().getCaloriePer100g() + " calories.");
            }
        }
        return this;
    }
}








