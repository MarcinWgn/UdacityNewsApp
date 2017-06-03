package com.example.marcin.wegrzyn.newsapp;

/**
 * Created by Marcin on 03.06.2017 :)
 */

public class News {

    private String title;
    private String webUrl;
    private String section;


    public News(String title, String webUrl, String section) {
        this.title = title;
        this.webUrl = webUrl;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getSection() {
        return section;
    }
}
