package kitchen;

import productsСharacteristics.Vegetables;

import java.util.ArrayList;
import java.util.Comparator;

public class Salad {

    Vegetables vegetables = new Vegetables();

    public String saladName;
    private ArrayList <Vegetables> saladIngredients;

    public Salad() {
    }

    public Salad(String saladName, ArrayList<Vegetables> saladIngredients) {
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

    public void setSaladIngredients() {
        this.saladIngredients = saladIngredients;
    }

//    public void countSaladCalories
//            (ArrayList <Vegetables> saladIngredients) {
//
//        double caloriesCount = 0.0;
//        for (Vegetables vegetables : saladIngredients) {
//            caloriesCount += vegetables.getWeightIngredientInDishesInGrams()
//                    * vegetables.getCaloriePer100g() / 100;
//        }
//        System.out.println("\nSum calories in Diet-Salad = " + caloriesCount + " calories");
//    }
//
//    public void sortSaladByWeightSaladIngredientsInDishes
//            (ArrayList <Vegetables> saladIngredients) {
//
//        System.out.println("\nSort saladIngredients by their weight in dishes:");
//        saladIngredients.sort(Comparator.comparing
//                (Vegetables::getWeightIngredientInDishesInGrams));
//        for (Vegetables vegetables : saladIngredients) {
//            System.out.println(vegetables.getVegetableName() + " - "
//                    + vegetables.getWeightIngredientInDishesInGrams() + " gm.");
//        }
//    }
//
//    public void sortSaladIngredient
//            (ArrayList <Vegetables> saladIngredients) {
//
//        System.out.println("\nFind vegetables in setting calories range (20.0 ; 35.0):");
//        for (Vegetables vegetables : saladIngredients) {
//            if (vegetables.getCaloriePer100g() >= 20.0
//                    && vegetables.getCaloriePer100g() <= 35.0) {
//                System.out.println(vegetables.getVegetableName() + " - "
//                        + vegetables.getCaloriePer100g() + " calories.");
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Salad(" + "saladName='" + saladName
                + '\'' + ", dietSalad=" + saladIngredients
                + ')';
    }
}

