package com.single.onehaweather.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.single.onehaweather.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by lenovo on 2017/12/5.
 */

public class HomeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    protected void onResume() {
        super.onResume();
        useHttpUrlConnectionGetThread();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void useHttpUrlConnectionGetThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("TAG", "===start===");
                try {
                    doVolleyJsonRequest();
                } catch (Exception ex) {
                    Log.i("TAG", ex.getMessage());
                }


            }
        }).start();
    }

    private void doVolleyJsonRequest() {
        RequestQueue requestQueue = Volley.newRequestQueue(getApplication());
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("https://way.jd.com/he/freeweather?city=beijing&appkey=6d8e03d0ae967ca4a130f4d384d659b8", null,
                new Response.Listener<JSONObject>() {
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray ja = response.getJSONObject("result").getJSONArray("HeWeather5");
                            for(int i=0;i<ja.length();i++){
                                Iterator<String> iterator=ja.getJSONObject(i).keys();
                                for(Iterator<String> it=iterator;it.hasNext();){
                                    Log.i("TAG",it.next());
                                }
                                Log.i("TAG",ja.getJSONObject(i).toString());
                            }
                        } catch (Exception ex) {

                        }
                        String rrs = response.toString();

//                        if(rrs.length()>20){
//                            int count=rrs.length()/20;
//                            for(int i=0;i<=count;i++){
//                                if(i<count){
//                                    Log.i("TAG",rrs.substring(i*20,i*20+20));
//                                }else if(i==count){
//                                    int countL=rrs.length()%20;
//                                    Log.i("TAG",rrs.substring(i*20,i*20+countL-1));
//                                }
//
//                            }
//                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("TAG", volleyError.getMessage(), volleyError);
            }
        });
        requestQueue.add(jsonObjectRequest);
    }
}
