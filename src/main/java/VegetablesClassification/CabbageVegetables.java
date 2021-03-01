package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class CabbageVegetables extends Vegetables {

    private CabbageVegetables (String productName, double priceKilo,
                           double caloriePer100g) {
        super(productName, priceKilo, caloriePer100g);
    }
    List<Vegetables> cabbageVegetables = Arrays.asList (

            new Vegetables("broccoli", 5.32, 34.6),
            new Vegetables("kohlrabi", 4.7, 44.0));
}