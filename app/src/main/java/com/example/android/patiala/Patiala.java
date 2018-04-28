package com.example.android.patiala;
public class Patiala {
    private int mImageId;
    private String mTitle;
    private String mDescription;
    private String mUrl;
    Patiala(int i, String title, String des)
    {
        mImageId=i;
        mTitle=title;
        mDescription=des;
    }
    Patiala(int i, String title, String des,String s)
    {
        mImageId=i;
        mTitle=title;
        mDescription=des;
        mUrl=s;
    }
    public int getImageId(){return mImageId;}
    public String getTitle(){return mTitle;}
    public String getDescription(){return mDescription;}
    public String getUrl(){return mUrl;}
}
