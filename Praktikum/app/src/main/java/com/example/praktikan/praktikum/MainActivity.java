package com.example.praktikan.praktikum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Wisata> ListWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Candi Information");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListWisata = new ArrayList<>();
        ListWisata.add(new Wisata("Borobudur","Categorie Book","candi borobudur adalah",R.drawable.borobudur));
        ListWisata.add(new Wisata("Prambanan","Categorie Book","Description book",R.drawable.prambanan));
        ListWisata.add(new Wisata("Ijo","Categorie Book","Description book",R.drawable.ijo));
        ListWisata.add(new Wisata("Ratu Boko","Categorie Book","Description book",R.drawable.ratu_boko));
        ListWisata.add(new Wisata("Sewu","Categorie Book","Description book",R.drawable.sewu));
        ListWisata.add(new Wisata("Kalasan","Categorie Book","Description book",R.drawable.kalasan));
        ListWisata.add(new Wisata("Plaosan","Categorie Book","Description book",R.drawable.plaosan));
        ListWisata.add(new Wisata("Sari","Categorie Book","Description book",R.drawable.sari));
        ListWisata.add(new Wisata("Sambisari","Categorie Book","Description book",R.drawable.sambisari));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,ListWisata);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}