package com.narender.abstractFactory.DAO;

public class DBDempDao implements DAO{
    public void save(){
        System.out.println("Saving Employee in DB !!");
    }
}
