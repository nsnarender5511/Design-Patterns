package com.narender.Template;

public class XMLDataRender extends DataRenderer{

    @Override
    public String readData(){
        System.out.println("Reading XML Data !!");
        return "Narender";
    }

    @Override
    public String processData(String data){
        System.out.println("Processing XML Data !!");
        return data + " Singh";
    }
}
