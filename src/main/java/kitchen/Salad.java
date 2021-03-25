package kitchen;

import productsСharacteristics.Vegetables;

import java.util.ArrayList;
import java.util.Comparator;

public class Salad {

    public String saladName;
    private ArrayList <Vegetables> saladIngredients;

    public Salad() {
    }

    public Salad(String saladName, ArrayList<Vegetables> saladIngredients) {
        this.saladName = saladName;
        this.saladIngredients = saladIngredients;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public ArrayList<Vegetables> getSaladIngredients() {
        return saladIngredients;
    }

    public void setSaladIngredients
            (ArrayList<Vegetables> saladIngredients) {
        this.saladIngredients = saladIngredients;
    }

    public double countSaladCalories (Salad salad) {

        double caloriesCount = 0.0;
        for (Vegetables vegetables : salad.saladIngredients) {
            caloriesCount += vegetables.getWeightIngredientInDishesInGrams()
                    * vegetables.getCaloriePer100g() / 100;
        }
        System.out.println("\nSum calories in Diet-Salad = " + caloriesCount + " calories");
        return caloriesCount;
    }

    public Salad sortSaladByWeightSaladIngredientsInDishes(Salad salad) {

        salad.saladIngredients.sort(Comparator.comparing
                (Vegetables :: getWeightIngredientInDishesInGrams));
        System.out.println("\nSort saladIngredients by their weight in dishes:");
        for (Vegetables vegetables : salad.saladIngredients) {
            System.out.println(vegetables.getVegetableName() + " - "
                    + vegetables.getWeightIngredientInDishesInGrams() + " gm.");
        }
        return this;
    }

    public Salad sortSaladIngredient(Salad salad) {

        System.out.println("\nFind vegetables in setting calories range (20.0 ; 35.0):");
        for (Vegetables vegetables : salad.saladIngredients) {
            if (vegetables.getCaloriePer100g() >= 20.0
                    && vegetables.getCaloriePer100g() <= 35.0) {
                System.out.println(vegetables.getVegetableName() + " - "
                        + vegetables.getCaloriePer100g() + " calories.");
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return  "saladName = " + saladName
                + ", consist of: " + saladIngredients;

    }
}

