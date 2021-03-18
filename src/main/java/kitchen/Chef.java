package kitchen;

import productsСharacteristics.Vegetables;
import restaurantProducts.*;

import java.util.ArrayList;

public class Chef {

    ArrayList <Vegetables> saladIngredients = new ArrayList <>();
    Salad salad = new Salad();

    public Chef createDietSalad () {

        salad.saladName = "DietSalad";

        Onion onion = new Onion (VegetablesTypes.BULBOUS_VEGETABLES,"onion", 6.9, 41.0, 25);
        Tomato tomato = new Tomato(VegetablesTypes.TOMATO_VEGETABLES,"tomato", 3.25, 24.0, 100);
        Broccoli broccoli = new Broccoli(VegetablesTypes.CABBAGE_VEGETABLES, "broccoli", 5.32, 34.6, 50);
        Carrot carrot= new Carrot(VegetablesTypes.ROOT_VEGETABLES, "carrot", 2.4, 35.0, 50);

        saladIngredients.add(onion);
        saladIngredients.add(tomato);
        saladIngredients.add(broccoli);
        saladIngredients.add(carrot);

        System.out.println ("\nCreate salad from the existing ingredients. "
            + "It's named:" + salad.getSaladName() + ", and consist of:");
        for (Vegetables vegetables : saladIngredients) {
        System.out.println(vegetables.getVegetableName()
                + "," + vegetables.getWeightIngredientInDishesInGrams() + " gm.");
    }
        return this;
    }
}
