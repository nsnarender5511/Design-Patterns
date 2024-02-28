package com.narender.Template;

public class CSVDataRenderer extends DataRenderer{
    public String readData(){
        System.out.println("Reading CSV Data !!");
        return "Shakti";
    }

    public String processData(String data){
        System.out.println("Processing CSV Data !!");
        return data + " Singh";
    }
}
