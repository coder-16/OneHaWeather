package com.single.onehaweather.helper;

import java.net.URL;

/**
 * Created by lenovo on 2018/2/15.
 */

public class LocationQueryHelper {
    public static String getCity(String city) {
        try{
            URL cityUrl=new URL("https://way.jd.com/he/freeweather?city="+city+"&appkey=6d8e03d0ae967ca4a130f4d384d659b8");

        }catch (java.net.MalformedURLException malformed){

        }
        return null;
    }
}
