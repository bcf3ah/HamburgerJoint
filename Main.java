package com.brian;

public class Main {

    public static void main(String[] args) {
//	    Base burger = new Base("rye", 2);
//        System.out.println(burger.getPrice());
//        burger.addIngredient("tomatoes", 3);
//        burger.addIngredient("pickles", 2);
//        burger.addIngredient("pickles", -1);
//
//        System.out.println("Total price is: $"+burger.getPrice());
        HealthyBurger healthyBurger = new HealthyBurger(1, "pickles", "lettuce");
        healthyBurger.addIngredient("lettuce", 2);
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addIngredient("pickles", 3);
        System.out.println("Total price is: $"+healthyBurger.getPrice());
        System.out.println("=================================================");

        DeluxBurger deluxBurger = new DeluxBurger("white", 3);
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addIngredient("Pickes", 4);
        System.out.println(deluxBurger.getChips().getAmount());


    }
}
