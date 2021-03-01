package Kitchen;

import RestarauntVegetables.Vegetables;

import java.util.ArrayList;
import java.util.Comparator;

public class Chef {

    public static void makeSaladCountCaloriesAndSortIngredient() {

        ArrayList<Salad> DietSalad = new ArrayList<>();

        DietSalad.add(new Salad("Diet-Salad", new Vegetables
                ("onion", 6.9, 41.0), 25));
        DietSalad.add(new Salad("Diet-Salad", new Vegetables
                ("tomato", 3.25, 24.0), 100));
        DietSalad.add(new Salad("Diet-Salad", new Vegetables
                ("broccoli", 5.32, 34.6), 50));
        DietSalad.add(new Salad("Diet-Salad", new Vegetables
                ("carrot", 2.4, 35.0), 50));

        System.out.println("Create a salad from the existing ingredients. "
                + "It's named: Diet-Salad, and consist of:");
        for (Salad salad : DietSalad) {
            System.out.println(salad.getVegetables().getVegetableName()
                    + "," + salad.getWeightIngredientInDishesInGrams() + " gm.");
        }

        double caloriesCount = 0.0;
        for (Salad salad : DietSalad) {
            caloriesCount += (salad.getWeightIngredientInDishesInGrams()
                    * salad.getVegetables().getCaloriePer100g() / 100);
        }
        System.out.println("\nSum calories in Diet-Salad = " + caloriesCount + " calories");

        System.out.println("\nSort saladIngredients by their weight in dishes:");
        DietSalad.sort(Comparator.comparing
                (Salad::getWeightIngredientInDishesInGrams));
        for (Salad salad : DietSalad) {
            System.out.println(salad.getVegetables().getVegetableName() + " - "
                    + salad.getWeightIngredientInDishesInGrams() + " gm.");
        }

        System.out.println("\nFind vegetables in setting calories range (20.0 ; 35.0):");
        for (Salad salad : DietSalad) {
            if (salad.getVegetables().getCaloriePer100g() >= 20.0
                    && salad.getVegetables().getCaloriePer100g() <= 35.0) {
                System.out.println(salad.getVegetables().getVegetableName() + " - "
                        + salad.getVegetables().getCaloriePer100g() + " calories.");
            }
        }
    }
}







