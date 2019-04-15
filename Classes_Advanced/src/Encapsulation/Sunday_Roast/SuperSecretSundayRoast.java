package Encapsulation.Sunday_Roast;

import java.util.ArrayList;

public class SuperSecretSundayRoast {


    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<String> guestList = new ArrayList<>();

/* old method
    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
    }*/

    public ArrayList<Ingredient> getIngredients(String password){
        if (password.equals("strongpassword123")) {
        return this.ingredients;
    }
        else
            return null;
    }

    public void addIngredient (Ingredient i) {
        if (!guestList.contains(i.ingredientName)) {
            this.ingredients.add(i);
        }
        else {
            System.out.println("EXTERMINATE EVERYTHING!");
        }
    }
}
