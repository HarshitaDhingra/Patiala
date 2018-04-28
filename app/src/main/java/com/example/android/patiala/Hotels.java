package com.example.android.patiala;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class Hotels extends AppCompatActivity {
    private PatialaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        final ArrayList<Patiala> categories=new ArrayList<Patiala>();
        categories.add(new Patiala(R.drawable.neem,getResources().getString(R.string.neemn),""));
        categories.add(new Patiala(R.drawable.mohan,getResources().getString(R.string.mohann),""));
        categories.add(new Patiala(R.drawable.hotel_harbans,getResources().getString(R.string.harbans),""));
        categories.add(new Patiala(R.drawable.eqbalin,getResources().getString(R.string.eqbaln),""));
        categories.add(new Patiala(R.drawable.amar,getResources().getString(R.string.amarn),""));
        categories.add(new Patiala(R.drawable.godwin,getResources().getString(R.string.godn),""));
        categories.add(new Patiala(R.drawable.mehbooba,getResources().getString(R.string.ajuban),""));
         adapter=new PatialaAdapter(this,categories, R.color.Stay);
         ListView listView = (ListView) findViewById(R.id.list);
         listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {
                Patiala currentHotel = adapter.getItem(position);
         Uri earthquakeUri = Uri.parse(currentHotel.getUrl());
         Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);
         startActivity(websiteIntent);
              }
             });
          }
}
