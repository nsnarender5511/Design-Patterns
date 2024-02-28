package com.narender.abstractFactory.AbstractDoaFactory;

import com.narender.abstractFactory.DAO.*;

public class XMLDaoFactory extends AbstactDaoFactory{

    public DAO createDoa(String type) {
        DAO d = null;
        if(type == "emp")  d = new XMLempDao();
        else d = new XMLDeptDao();
        //d.save();

        return d;
    }


}
