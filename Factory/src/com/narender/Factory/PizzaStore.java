package com.narender.Factory;

public class PizzaStore {

    public Pizza orderPizza(String Type){
        Pizza pizza = PizzaFactory.createPizza("Veg");


        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
