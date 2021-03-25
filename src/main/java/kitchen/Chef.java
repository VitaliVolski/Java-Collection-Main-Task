package kitchen;

import productsСharacteristics.Vegetables;
import java.util.ArrayList;

public class Chef {

    public Salad createDietSalad(ArrayList<Vegetables> dietSaladIngredients) {

        Salad dishDietSalad = new Salad("Diet-Salad", dietSaladIngredients);

        return dishDietSalad;
    }
}
