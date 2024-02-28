package com.narender.Template;

public abstract class DataRenderer {

    public void render() {
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);
    }


    protected abstract String readData();

    protected abstract String processData(String data);
}