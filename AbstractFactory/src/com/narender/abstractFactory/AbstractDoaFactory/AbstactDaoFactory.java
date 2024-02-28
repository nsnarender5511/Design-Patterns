package com.narender.abstractFactory.AbstractDoaFactory;

import com.narender.abstractFactory.DAO.DAO;

public abstract class AbstactDaoFactory {

    public abstract DAO createDoa(String type);
}
