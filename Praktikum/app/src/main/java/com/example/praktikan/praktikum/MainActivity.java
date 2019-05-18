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
        ListWisata.add(new Wisata("Borobudur","Candi Borobudur adalah candi Buddha terbesar di dunia. " +
                "Dibangun pada abad ke-9, Candi Borobudur sekarang menjadi magnet yang mampu menarik jutaan wisatawan setiap tahun." + "\n" + "\n" +
                "Candi Borobudur buka setiap hari pk 06:00 sampai pk 17:00. Waktu terbaik untuk mengunjungi Candi Borobudur adalah " +
                "pagi-pagi sekali, saat udara masih segar. Bila ikut paket Borobudur Sunrise (Rp350.000/orang), kita bisa masuk candi " +
                "mulai pk 4:30 lewat Manohara." +
                "Harga tiket masuk Candi Borobudur adalah Rp40.000 untuk dewasa, dan Rp20.000 untuk anak 3-10 tahun. Ada diskon 50% untuk " +
                "rombongan pelajar/mahasiswa, minimal 20 orang.",
                R.drawable.borobudur));
        ListWisata.add(new Wisata("Prambanan","Description book",R.drawable.prambanan));
        ListWisata.add(new Wisata("Ijo","Description book",R.drawable.ijo));
        ListWisata.add(new Wisata("Ratu Boko","Description book",R.drawable.ratu_boko));
        ListWisata.add(new Wisata("Sewu","Description book",R.drawable.sewu));
        ListWisata.add(new Wisata("Kalasan","Description book",R.drawable.kalasan));
        ListWisata.add(new Wisata("Plaosan","Description book",R.drawable.plaosan));
        ListWisata.add(new Wisata("Sari","Description book",R.drawable.sari));
        ListWisata.add(new Wisata("Sambisari","Description book",R.drawable.sambisari));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,ListWisata);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}