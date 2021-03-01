package VegetablesClassification;

import RestarauntVegetables.Vegetables;

import java.util.Arrays;
import java.util.List;

public class LegumesVegetables extends Vegetables {

    private LegumesVegetables (String productName, double priceKilo,
                               double caloriePer100g){
        super(productName, priceKilo, caloriePer100g);
    }
    List<Vegetables> legumesVegetables = Arrays.asList (

            new Vegetables("beans", 2.3, 37.0),
            new Vegetables("peas", 2.7, 37.0));
}
