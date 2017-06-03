package com.example.marcin.wegrzyn.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int QueryLoaderID = 3;
    public static final String URL = "http://content.guardianapis.com/search?q=debates&api-key=test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
