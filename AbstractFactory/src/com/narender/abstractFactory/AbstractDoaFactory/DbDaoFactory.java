package com.narender.abstractFactory.AbstractDoaFactory;

import com.narender.abstractFactory.DAO.DAO;
import com.narender.abstractFactory.DAO.DBDempDao;
import com.narender.abstractFactory.DAO.DBDeptDao;

public class DbDaoFactory extends AbstactDaoFactory {


    public DAO createDoa(String type) {
        DAO d = null;
        if(type == "emp")  d = new DBDempDao();
        else d = new DBDeptDao();
        //d.save();

        return d;
    }
}
