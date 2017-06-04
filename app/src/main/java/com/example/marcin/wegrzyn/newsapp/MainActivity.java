package com.example.marcin.wegrzyn.newsapp;

import android.app.LoaderManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements android.app.LoaderManager.LoaderCallbacks<ArrayList<News>>{

    private TextView emptyView;
    private ListView listView;
    private ProgressBar progressBar;
    private NewsAdapter newsAdapter;

    public static final int QueryLoaderID = 3;
    public static final String URL = "http://content.guardianapis.com/search?q=debates&api-key=test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        emptyView = (TextView) findViewById(R.id.emptyView);

        newsAdapter = new NewsAdapter(this, new ArrayList<News>());
        listView.setAdapter(newsAdapter);

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(QueryLoaderID, null, this);
        } else {
            progressBar.setVisibility(View.GONE);
            emptyView.setText(R.string.no_internet);
        }
    }

    @Override
    public android.content.Loader<ArrayList<News>> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this, URL);
    }

    @Override
    public void onLoadFinished(android.content.Loader<ArrayList<News>> loader, ArrayList<News> news) {

        progressBar.setVisibility(View.GONE);

        newsAdapter.clear();

        if (news != null && !news.isEmpty()) {
            newsAdapter.addAll(news);
        } else emptyView.setText(R.string.no_data);

    }

    @Override
    public void onLoaderReset(android.content.Loader<ArrayList<News>> loader) {
        newsAdapter.clear();
    }
}
