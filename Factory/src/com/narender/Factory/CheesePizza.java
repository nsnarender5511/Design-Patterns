package com.narender.Factory;

public class CheesePizza implements Pizza{
    public void prepare(){
        System.out.println("Preparing Cheeze Pizza !! ");
    }
    public void bake(){
        System.out.println("Baking Cheeze Pizza !! ");

    }
    public void cut(){
        System.out.println("Cutting Cheeze Pizza !! ");

    }
}
