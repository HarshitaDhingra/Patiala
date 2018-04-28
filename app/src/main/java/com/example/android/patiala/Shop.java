package com.example.android.patiala;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Shop extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
            ArrayList<Patiala> categories=new ArrayList<Patiala>();
            categories.add(new Patiala(R.drawable.adalat,getResources().getString(R.string.adalatn),getResources().getString(R.string.adalat)));
            categories.add(new Patiala(R.drawable.qilamarket,getResources().getString(R.string.qilann),getResources().getString(R.string.qila)));
            categories.add(new Patiala(R.drawable.omaxe,getResources().getString(R.string.omaxen),getResources().getString(R.string.omaxe)));
            categories.add(new Patiala(R.drawable.ac,getResources().getString(R.string.acn),getResources().getString(R.string.qilamubarak)));
            categories.add(new Patiala(R.drawable.phul,getResources().getString(R.string.phulkarin),getResources().getString(R.string.phul)));
            categories.add(new Patiala(R.drawable.dharam,getResources().getString(R.string.dharamn),getResources().getString(R.string.dharam)));
            PatialaAdapter adapter=new PatialaAdapter(this,categories, R.color.Shop);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
    }
}
