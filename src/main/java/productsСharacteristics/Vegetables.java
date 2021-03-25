package productsСharacteristics;

import restaurantProducts.VegetablesTypes;

public class Vegetables {

    private VegetablesTypes vegetablesTypes;
    private String vegetableName;
    private double priceKilo;
    private double caloriePer100g;
    private double weightIngredientInDishesInGrams;

    public Vegetables() {
    }

    public Vegetables(VegetablesTypes vegetablesTypes, String vegetableName,
                      double priceKilo, double caloriePer100g) {
        this.vegetablesTypes = vegetablesTypes;
        this.vegetableName = vegetableName;
        this.priceKilo = priceKilo;
        this.caloriePer100g = caloriePer100g;
    }

    public Vegetables(VegetablesTypes vegetablesTypes, String vegetableName,
                      double priceKilo, double caloriePer100g,
                      double weightIngredientInDishesInGrams) {
        this.vegetablesTypes = vegetablesTypes;
        this.vegetableName = vegetableName;
        this.priceKilo = priceKilo;
        this.caloriePer100g = caloriePer100g;
        this.weightIngredientInDishesInGrams = weightIngredientInDishesInGrams;
    }

    public VegetablesTypes getVegetablesTypes() {
        return vegetablesTypes;
    }

    public void setVegetablesTypes(VegetablesTypes vegetablesTypes) {
        this.vegetablesTypes = vegetablesTypes;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public double getPriceKilo() {
        return priceKilo;
    }

    public void setPriceKilo(double priceKilo) {
        this.priceKilo = priceKilo;
    }

    public double getCaloriePer100g() {
        return caloriePer100g;
    }

    public void setCaloriePer100g(double caloriePer100g) {
        this.caloriePer100g = caloriePer100g;
    }

    public double getWeightIngredientInDishesInGrams() {
        return weightIngredientInDishesInGrams;
    }

    public void setWeightIngredientInDishesInGrams
            (double weightIngredientInDishesInGrams) {
        this.weightIngredientInDishesInGrams = weightIngredientInDishesInGrams;
    }

    @Override
    public String toString() {
        return "\n" + vegetableName + "-"
                + weightIngredientInDishesInGrams + " gr.";
    }
}
