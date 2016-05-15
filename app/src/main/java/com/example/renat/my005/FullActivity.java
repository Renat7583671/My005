package com.example.renat.my005;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FullActivity extends AppCompatActivity {

    TextView nameTxt;
    TextView piceCoast;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        nameTxt = (TextView)findViewById(R.id.nameTextDetail);
        piceCoast =(TextView)findViewById(R.id.descLabelDetail);
        img = (ImageView)findViewById(R.id.bImageDetail);

        Intent i =this.getIntent();
        String name =i.getExtras().getString("NAME_KEY");
        String price =i.getExtras().getString("PRICE_KEY");
        int image =i.getExtras().getInt("IMAGE_KEY");

        nameTxt.setText(name);
        piceCoast.setText(price);
        img.setImageResource(image);

    }

}
