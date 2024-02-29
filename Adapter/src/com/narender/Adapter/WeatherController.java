package com.narender.Adapter;

public class WeatherController {
    public static int find(int zipCode){
        return WeatherAdapter.findTemp(zipCode);
    }
}
