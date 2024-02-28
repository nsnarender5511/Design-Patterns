package com.narender.abstractFactory.DAO;

public class DBDeptDao implements DAO{
    public void save(){
        System.out.println("Saving Depatrment in DB !!");
    }
}
