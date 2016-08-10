package com.cangli.tech.intersect.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cangli.tech.intersect.R;

public class CharacterActivity extends AppCompatActivity {
    private TextView tv_Intro;
    private Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        tv_Intro = (TextView) findViewById(R.id.tv_Intro);
        tv_Intro.setText("hello from class");
        btnHello = (Button) findViewById(R.id.btnHello);



    }

}
