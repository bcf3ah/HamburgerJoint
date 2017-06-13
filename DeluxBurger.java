package com.brian;

/**
 * Created by Brian on 6/13/2017.
 */
public class DeluxBurger extends Base {
    private Chips chips;
    private Drink drink;

    public DeluxBurger(String breadRollType, int meat) {
        super(breadRollType, meat);
        this.chips = new Chips();
        this.drink = new Drink();
    }

//    public void addIngredient(){
//        System.out.println("You cannot add any ingredients to the delux burger!");
//    }


    @Override
    public void addIngredient(String name, int amount) {
        System.out.println("You cannot add any ingredients to the delux burger!");
    }

    public Chips getChips() {
        return chips;
    }

    public Drink getDrink() {
        return drink;
    }
}
