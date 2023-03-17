package com.example.androidhomework4;

public class DataModel {
    private String title;
    private int image;
    private String titleMore;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitleMore() {
        return titleMore;
    }

    public void setTitleMore(String titleMore) {
        this.titleMore = titleMore;
    }

    public DataModel(String title, int image) {
        this.title = title;
        this.image = image;

    }
}
