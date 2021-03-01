package Kitchen;

import RestarauntVegetables.Vegetables;

public class Salad {

    private String saladName;
    private Vegetables vegetables;
    private double weightIngredientInDishesInGrams;

    public Salad(String saladName, Vegetables vegetables,
                 double weightIngredientInDishesInGrams) {
        this.saladName = saladName;
        this.vegetables = vegetables;
        this.weightIngredientInDishesInGrams = weightIngredientInDishesInGrams;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
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
        return "Salad(" + "saladName:'" + saladName + '\''
                +  "Vegetables(" + "name='" + vegetables.getVegetableName() + '\''
                +  ", priceKilo=" + vegetables.getPriceKilo()
                +  ", calorie=" + vegetables.getCaloriePer100g()
                +  "), weightIngredientInDishesInGrams:" + weightIngredientInDishesInGrams + ')';
    }
}
