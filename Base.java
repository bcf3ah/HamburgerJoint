package com.brian;

/**
 * Created by Brian on 6/13/2017.
 */

public class Base {
    private String breadRollType;
    private int meat;
    private double price;
    private Tomatoes tomatoes = new Tomatoes();
    private Lettuce lettuce = new Lettuce();
    private Pickles pickles = new Pickles();

    public Base(String breadRollType, int meat){
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 5.00;
    }

    public void addIngredient(String name, int amount){
        switch(name.toLowerCase()){
            case "tomatoes":
                tomatoes.addIngredient(amount);
                this.price += (tomatoes.getPrice() * amount);
                break;
            case "lettuce":
                lettuce.addIngredient(amount);
                this.price += (lettuce.getPrice() * amount);
                break;
            case "pickles":
                pickles.addIngredient(amount);
                this.price += (pickles.getPrice() * amount);
                break;
            default:
                System.out.println("Ingredient not found.");
        }
    }

    public double getPrice() {
        return price;
    }
}
