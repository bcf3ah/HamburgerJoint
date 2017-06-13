package com.brian;

/**
 * Created by Brian on 6/13/2017.
 */

public class Additions {
    private String name;
    private double price;
    private int amount;

    public Additions(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void addIngredient(int num) {
        this.amount += num;
        System.out.println("You added " + num + " " + this.name+". Total "+this.name+" is now "+getAmount());
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}

class Tomatoes extends Additions {
    public Tomatoes() {
        super("Tomatoes", 0.5, 0);
    }
}

class Lettuce extends Additions {
    public Lettuce() {
        super("Lettuce", 0.3, 0);
    }
}

class Pickles extends Additions {
    public Pickles() {
        super("Pickles", 0.8, 0);
    }
}

class Chips extends Additions {
    public Chips() {
        super("Chips", 0.4, 1);
    }
}

class Drink extends Additions {
    public Drink() {
        super("Drink", 2.0, 1);
    }
}