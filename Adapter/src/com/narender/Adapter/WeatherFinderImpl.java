package com.narender.Adapter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherFinderImpl implements WeatherFinder{


    @Override
    public int findLocal(String city) {
        int temp = -1;

        if(city=="Kota") {
            temp =  23;
        }
        else if(city=="Pune") {
            temp = 15;
        }

        if(temp!=-1) System.out.println(city + "   Temprature is - " + temp);
        else System.out.println("Please Provide a Valid City/Zipcode");
        return temp;
    }

    @Override
    public int findOnWeb(String city) {
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create("https://api.open-meteo.com/v1/forecast?latitude=25.192181&longitude=75.850838&current=temperature_2m,wind_speed_10m"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = null;

        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(response.body());


        return 0;
    }
}
