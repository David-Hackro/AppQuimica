package pue.mtz.pau.appquimica.Models;

/**
 * Created by david on 24/10/16.
 */

public class Ingredient {
    private String Name;

    public Ingredient(String name) {
        Name = name;
    }

    public Ingredient() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
