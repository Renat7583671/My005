package com.example.renat.my005;


import java.util.ArrayList;

public class BicycleCollection {
    public static ArrayList<Bicycle> getBicycles()
    {
        ArrayList<Bicycle> bicycles= new ArrayList<>();
        Bicycle bicycle = null;


        bicycle = new Bicycle();
        bicycle.setName("Apollo");
        bicycle.setPrice("500$");
        bicycle.setImage(R.drawable.bcyc1);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("BMX");
        bicycle.setPrice("100$");
        bicycle.setImage(R.drawable.bcyc2);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("Suzuki");
        bicycle.setPrice("200$");
        bicycle.setImage(R.drawable.porsche_bike_fs);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("BMW");
        bicycle.setPrice("300$");
        bicycle.setImage(R.drawable.porsche_bike_fs_blue);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("Mazda");
        bicycle.setPrice("100$");
        bicycle.setImage(R.drawable.team_kid_200_green);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("Rover");
        bicycle.setPrice("50$");
        bicycle.setImage(R.drawable.unusual_bikes_new_11);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("RENAULT");
        bicycle.setPrice("200$");
        bicycle.setImage(R.drawable.cronus_baturo_1);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("TVR");
        bicycle.setPrice("500$");
        bicycle.setImage(R.drawable.wsd_2009_navigator2);
        bicycles.add(bicycle);


        bicycle = new Bicycle();
        bicycle.setName("Bice Best");
        bicycle.setPrice("5000$");
        bicycle.setImage(R.drawable.bcyc1);
        bicycles.add(bicycle);

        bicycle = new Bicycle();
        bicycle.setName("TOYOTA");
        bicycle.setPrice("700$");
        bicycle.setImage(R.drawable.bcyc2);
        bicycles.add(bicycle);


        bicycle = new Bicycle();
        bicycle.setName("MITSUBISHE");
        bicycle.setPrice("300$");
        bicycle.setImage(R.drawable.bcyc1);
        bicycles.add(bicycle);


        bicycle = new Bicycle();
        bicycle.setName("COBRA");
        bicycle.setPrice("250$");
        bicycle.setImage(R.drawable.bcyc2);
        bicycles.add(bicycle);

        return  bicycles;
    }
}
