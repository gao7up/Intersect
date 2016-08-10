package com.cangli.tech.intersect;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.cangli.tech.intersect.activity.CharacterActivity;
import com.cangli.tech.intersect.internet.GetRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements ServiceConnection {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.btnCharacter).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,CharacterActivity.class));
//            }
//        });
        Intent serviceIntent = new Intent(this, GetRequest.class);
        startService(serviceIntent);
        bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);


    }


    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        System.out.println("onServiceConnected");
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {

    }
}
