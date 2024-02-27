package com.narender.Factory;

public class PizzaFactory {


    public static Pizza createPizza(String Type){
        Pizza pizza = null;
        switch (Type){
            case "Veg":
                pizza = new VegPizza();
                break;
            case "cheeze":
                pizza = new CheesePizza();
                break;
            default:
                System.out.println("Not Available");
                break;

        }

        return pizza;
    }
}
