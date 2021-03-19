package kitchen;

public class Chef extends DietSalad {

    Salad salad = new Salad();
    DietSalad dietSalad = new DietSalad();

    public Chef createDietSalad () {

        salad.saladName = "DietSalad";

        System.out.println ("\nCreate salad from the existing ingredients. "
            + "It's named:" + salad.getSaladName() + ", and consist of:"
                + ..............? );
        return this;
    }
}
