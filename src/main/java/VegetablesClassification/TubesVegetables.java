package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class TubesVegetables extends Vegetables {

    private TubesVegetables(String productName, double priceKilo,
                           double caloriePer100g) {
        super(productName, priceKilo, caloriePer100g);
    }
    List<Vegetables> tubesVegetables = Arrays.asList (

            new Vegetables("potatoes", 1.5, 77.0),
            new Vegetables("sweetPotato", 4.3, 85.0));
}
