package com.example.android.patiala;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Importance=(TextView)findViewById(R.id.HistoricalImportance);
        Importance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Shop.class);
                startActivity(i);
            }
        });
        TextView Attractions=(TextView)findViewById(R.id.PublicAttractions);
        Attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Attractions.class);
                startActivity(i);
            }
        });
        TextView Hotels=(TextView)findViewById(R.id.Hotels);
        Hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Hotels.class);
                startActivity(i);
            }
        });
        TextView Restaurants=(TextView)findViewById(R.id.Restaurants);
        Restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Restaurants.class);
                startActivity(i);
            }
        });
    }
    public void Patiala(View v)
    {
        Intent i=new Intent(MainActivity.this,Description.class);
        startActivity(i);
    }
}
