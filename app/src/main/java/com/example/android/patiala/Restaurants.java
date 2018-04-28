package com.example.android.patiala;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
public class Restaurants extends AppCompatActivity {
    private PatialaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ArrayList<Patiala> categories = new ArrayList<Patiala>();
        categories.add(new Patiala(R.drawable.foodjail,getResources().getString(R.string.jailn),""));
        categories.add(new Patiala(R.drawable.barista,getResources().getString(R.string.baristan),""));
        categories.add(new Patiala(R.drawable.brewestate,getResources().getString(R.string.brewn),""));
        categories.add(new Patiala(R.drawable.gopal,getResources().getString(R.string.gopaln),""));
        categories.add(new Patiala(R.drawable.boston,getResources().getString(R.string.bostonn),""));
        categories.add(new Patiala(R.drawable.yellow,getResources().getString(R.string.yellown),""));
        categories.add(new Patiala(R.drawable.ccd,getResources().getString(R.string.ccdn),""));
        adapter = new PatialaAdapter(this, categories, R.color.Food);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
