package com.example.renat.my005;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {


    Context c;
    ArrayList<Bicycle> bicycles;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Bicycle> bicycles) {
        this.c = c;
        this.bicycles = bicycles;
        inflater =(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return bicycles.size();
    }

    @Override
    public Object getItem(int position) {
        return bicycles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);

        }

        TextView nameTxt = (TextView) convertView.findViewById(R.id.nameText);
        ImageView img = (ImageView) convertView.findViewById(R.id.bImage);

        final String name =bicycles.get(position).getName();
        final String price = bicycles.get(position).getPrice();
        final int image = bicycles.get(position).getImage();


        nameTxt.setText(name);

        img.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(name,price,image);
            }
        });



        return convertView;
    }
    private void openDetailActivity(String name,String price,int image)
    {
        Intent i= new Intent(c,FullActivity.class);
        i.putExtra("NAME_KEY", name);
        i.putExtra("IMAGE_KEY", image);
        i.putExtra("PRICE_KEY",price);

        c.startActivity(i);
    }
}
