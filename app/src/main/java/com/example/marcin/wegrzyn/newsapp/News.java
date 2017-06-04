package com.example.marcin.wegrzyn.newsapp;

/**
 * Created by Marcin on 03.06.2017 :)
 */

class News {
    public String getStringData() {
        return stringData;
    }

    private String title;
    private String webUrl;
    private String section;
    private String stringData;


    News(String title, String webUrl, String section, String stringData) {
        this.title = title;
        this.webUrl = webUrl;
        this.section = section;
        this.stringData = formatData(stringData);
    }

    private String formatData(String data) {

        String splitString[] = data.split("T");

        return splitString[0];
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
