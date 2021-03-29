package kitchen;

import productsСharacteristics.Vegetables;
import restaurantProducts.*;

import java.util.ArrayList;

public class VegetablesStore {

    public VegetablesStore() {
    }

    public ArrayList<Vegetables> collectDietSaladIngredients() {

        Carrot carrot = new Carrot(VegetablesTypes.ROOT_VEGETABLES, "carrot", 2.4, 35.0, 50);
        Onion onion = new Onion(VegetablesTypes.BULBOUS_VEGETABLES, "onion", 6.9, 41.0, 25);
        Tomato tomato = new Tomato(VegetablesTypes.TOMATO_VEGETABLES, "tomato", 3.25, 24.0, 100);
        Broccoli broccoli = new Broccoli(VegetablesTypes.CABBAGE_VEGETABLES, "broccoli", 5.32, 34.6, 50);

        ArrayList<Vegetables> dietSaladIngredients = new ArrayList<>();

        dietSaladIngredients.add(carrot);
        dietSaladIngredients.add(onion);
        dietSaladIngredients.add(tomato);
        dietSaladIngredients.add(broccoli);

        return dietSaladIngredients;
    }
}

