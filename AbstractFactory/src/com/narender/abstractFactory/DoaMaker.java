package com.narender.abstractFactory;

import com.narender.abstractFactory.AbstractDoaFactory.AbstactDaoFactory;
import com.narender.abstractFactory.AbstractDoaFactory.DbDaoFactory;
import com.narender.abstractFactory.AbstractDoaFactory.XMLDaoFactory;

public class DoaMaker {

    public static AbstactDaoFactory getDao(String factoryType){

        AbstactDaoFactory abstactDaoFactory = null;

        if(factoryType == "XML") abstactDaoFactory = new XMLDaoFactory();
        else abstactDaoFactory = new DbDaoFactory();

        //abstactDaoFactory.createDoa("emp");

        return abstactDaoFactory;

    }
}
