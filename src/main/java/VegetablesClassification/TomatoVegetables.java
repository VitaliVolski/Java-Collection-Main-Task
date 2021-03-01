package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class TomatoVegetables extends Vegetables {

    private TomatoVegetables (String productName, double priceKilo,
        double caloriePer100g) {
        super(productName, priceKilo, caloriePer100g);
        }

    List<Vegetables> tomatoVegetables = Arrays.asList (

            new Vegetables("tomato", 3.25, 24.0));
}