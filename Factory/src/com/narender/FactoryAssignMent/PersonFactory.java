package com.narender.FactoryAssignMent;

import java.security.PublicKey;

public class PersonFactory {

    public static Person createPerson(String gender){
        Person p = null;

        if(gender == "male") p = new Male();
        else p = new Female();

        p.wish();
        return p;
    }
}
