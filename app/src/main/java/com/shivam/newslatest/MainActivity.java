package com.shivam.newslatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    String url="https://newsdata.io/api/1/news?apikey=pub_11004b372dd91d8b810f25f236d20cc81b2e3&country=in&language=en&category=food ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> user=new ArrayList<>();
        RecyclerView r = findViewById(R.id.recyclerview);
        r.setLayoutManager(new LinearLayoutManager(this));
        StringRequest request=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("data", response);
                GsonBuilder b=new GsonBuilder();
                Gson g= b.create();
                user=g.fromJson(response, (Type) com.shivam.newslatest.user.class);
                r.setAdapter(new padapter(user, MainActivity.this));

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue q= Volley.newRequestQueue(this);
        q.add(request);

    }
}

