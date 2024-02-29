package com.narender.Adapter;

import java.io.IOException;

public interface WeatherFinder {
    public int findLocal(String city);
    public int findOnWeb(String city);
}
