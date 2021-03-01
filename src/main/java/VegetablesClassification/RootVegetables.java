package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class RootVegetables extends Vegetables {

    private RootVegetables (String productName, double priceKilo,
                           double caloriePer100g) {
        super(productName, priceKilo, caloriePer100g);
    }
    List<Vegetables> RootVegetables = Arrays.asList (

            new Vegetables("dill", 6.8,12.25),
            new Vegetables("parsley", 7.0, 14.3));
}
