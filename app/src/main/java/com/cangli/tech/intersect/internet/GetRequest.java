package com.cangli.tech.intersect.internet;

import android.app.DownloadManager;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Alienware on 2016/8/10.
 */
public class GetRequest {

//    public void gethttp(){
//        // Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="http://www.google.com";
//
//        // Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        //mTextView.setText("Response is: "+ response.substring(0,500));
//                        System.out.println("Response is" + response.substring(0,500));
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                //mTextView.setText("That didn't work!");
//                System.out.println("network error");
//            }
//        });
//        // Add the request to the RequestQueue.
//        queue.add(stringRequest);
//    }
}
