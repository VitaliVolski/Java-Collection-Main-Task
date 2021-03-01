package RestarauntVegetables;

public class Vegetables {

        private String vegetableName;
        private double priceKilo;
        private double caloriePer100g;

        public Vegetables(String vegetableName, double priceKilo,
                          double caloriePer100g) {
                this.vegetableName = vegetableName;
                this.priceKilo = priceKilo;
                this.caloriePer100g = caloriePer100g;
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

        @Override
        public String toString() {
                return "Vegetables:(" + "name='" + vegetableName + '\''
                        + ", priceKilo=" + priceKilo
                        + ", calorie=" + caloriePer100g + ')';
        }
}

