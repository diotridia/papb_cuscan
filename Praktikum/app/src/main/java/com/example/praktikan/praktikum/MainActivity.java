package com.example.praktikan.praktikum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Wisata> ListWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListWisata = new ArrayList<>();
        ListWisata.add(new Wisata("Test","Categorie Book","Description book",R.drawable.adathome));
        ListWisata.add(new Wisata("MAKAN HOME","Categorie Book","Description book",R.drawable.makananhome));
        ListWisata.add(new Wisata("","Categorie Book","Description book",R.drawable.wisatahome));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,ListWisata);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}