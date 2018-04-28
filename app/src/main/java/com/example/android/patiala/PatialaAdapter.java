package com.example.android.patiala;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class PatialaAdapter extends ArrayAdapter<Patiala>{

        private int mColorResourceId;
        public PatialaAdapter(Context context, ArrayList<Patiala> category, int ColorResourceId) {
            super(context,0,category);
            mColorResourceId=ColorResourceId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            Patiala my_patiala= (Patiala)getItem(position);
            TextView Description = (TextView) listItemView.findViewById(R.id.description);
            Description.setText(my_patiala.getDescription());
            TextView title = (TextView) listItemView.findViewById(R.id.title);
            title.setText(my_patiala.getTitle());
            ImageView i=(ImageView) listItemView.findViewById(R.id.image);
            i.setImageResource(my_patiala.getImageId());
            View textContainer =listItemView.findViewById(R.id.text_container);
            int color= ContextCompat.getColor(getContext(),mColorResourceId);
            textContainer.setBackgroundColor(color);
            return listItemView;
        }
    }
