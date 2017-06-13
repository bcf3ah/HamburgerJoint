package com.brian;

/**
 * Created by Brian on 6/13/2017.
 */
public class HealthyBurger extends Base {
    private String item1;
    private String item2;
    private int totalIngredients = 2;

    public HealthyBurger( int meat, String item1, String item2) {
        super("Whole wheat", meat);
        this.item1 = item1;
        this.item2 = item2;
    }

    public void addIngredient(String name, int amount){
        if(totalIngredients + amount <= 6){
            super.addIngredient(name, amount);
        } else {
            System.out.println("You can only have 6 ingredients");
        }
    }
}
