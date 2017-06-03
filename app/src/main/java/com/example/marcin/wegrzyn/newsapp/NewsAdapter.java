package com.example.marcin.wegrzyn.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Marcin on 03.06.2017 :)
 */

public class NewsAdapter extends ArrayAdapter <News> {
    public NewsAdapter(@NonNull Context context, @NonNull News[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;

        if (listView == null) {

            listView = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }

        News news = getItem(position);

        TextView title = (TextView) listView.findViewById(R.id.titleTv);
        TextView section = (TextView) listView.findViewById(R.id.sectionTv);

        title.setText(news.getTitle());
        section.setText(news.getSection());

        return listView;
    }


}
