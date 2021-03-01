package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class BulbousVegetables extends Vegetables {

    private BulbousVegetables (String productName, double priceKilo,
                               double caloriePer100g) {
        super(productName, priceKilo, caloriePer100g);
    }
    List<Vegetables> bulbousVegetables = Arrays.asList (

            new Vegetables("lettuce", 5.0, 9.2),
            new Vegetables("onion", 6.9, 41.0),
            new Vegetables("garlic", 9.39, 149.0));
}
