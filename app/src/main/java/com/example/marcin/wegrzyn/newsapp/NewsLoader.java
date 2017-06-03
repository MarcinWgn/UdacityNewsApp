package com.example.marcin.wegrzyn.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Marcin on 03.06.2017 :)
 */

public class NewsLoader extends AsyncTaskLoader<ArrayList<News>> {

    private String stringUrl;

    public NewsLoader(Context context, String stringUrl) {
        super(context);
        this.stringUrl = stringUrl;
    }

    @Override
    public ArrayList<News> loadInBackground() {

        if (stringUrl == null) return null;

        // TODO: 03.06.2017 dodać zapytanie QueryUtils
        return null;
    }
}
