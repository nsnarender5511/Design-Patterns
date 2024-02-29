package com.narender.Adapter;

import java.lang.ref.WeakReference;

public class WeatherAdapter {
    public static int findTemp(int zipCode){

        WeatherFinder weatherFinder = new WeatherFinderImpl();

        if(zipCode == 324001) return weatherFinder.findLocal("Kota");
        else if(zipCode == 415015) return weatherFinder.findOnWeb("Pune");

        return 0;

    }
}
