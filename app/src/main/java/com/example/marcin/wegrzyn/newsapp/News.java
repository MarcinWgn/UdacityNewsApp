package com.example.marcin.wegrzyn.newsapp;

/**
 * Created by Marcin on 03.06.2017 :)
 */

class News {

    private String title;
    private String webUrl;
    private String section;


    News(String title, String webUrl, String section) {
        this.title = title;
        this.webUrl = webUrl;
        this.section = section;
    }

    String getTitle() {
        return title;
    }

    String getWebUrl() {
        return webUrl;
    }

    String getSection() {
        return section;
    }
}
