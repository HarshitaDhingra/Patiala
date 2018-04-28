package com.example.android.patiala;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
public class Attractions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ArrayList<Patiala> categories=new ArrayList<Patiala>();
        categories.add(new Patiala(R.drawable.gurdwara_dukh_nivaran,getResources().getString(R.string.gurun),getResources().getString(R.string.guru)));
        categories.add(new Patiala(R.drawable.qilamubarak,getResources().getString(R.string.qilann),getResources().getString(R.string.qilamubarak)));
        categories.add(new Patiala(R.drawable.sheesh,getResources().getString(R.string.sheeshn),getResources().getString(R.string.sheesh)));
        categories.add(new Patiala(R.drawable.baradari,getResources().getString(R.string.baran),getResources().getString(R.string.baradari)));
        categories.add(new Patiala(R.drawable.kali_mandir,getResources().getString(R.string.kalin),getResources().getString(R.string.kali_mandir)));
        categories.add(new Patiala(R.drawable.moti,getResources().getString(R.string.motin),getResources().getString(R.string.moti)));
        categories.add(new Patiala(R.drawable.nis,getResources().getString(R.string.netan),getResources().getString(R.string.nis)));
        PatialaAdapter adapter=new PatialaAdapter(this,categories, R.color.Attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
