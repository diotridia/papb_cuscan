package com.example.praktikan.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public Button informasi_candi;
    public Button mulai_tracking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        informasi_candi =(Button) findViewById(R.id.informasi_candi);
        mulai_tracking = (Button) findViewById(R.id.mulai_tracking);
        informasi_candi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinformasi_candi();
            }
        });
        mulai_tracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmulai_tracking();
            }
        });
    }
    public void openinformasi_candi(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openmulai_tracking(){
        Intent intent = new Intent(this,mulai_tracking.class);
        startActivity(intent);
    }
}
