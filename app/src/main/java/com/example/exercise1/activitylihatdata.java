package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.TextView;

import java.util.ArrayList;


public class activitylihatdata extends AppCompatActivity {
    public static ArrayList<Class_nama> classNamaArrayList=new ArrayList<Class_nama>();
    TextView tvnama, tvnomor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvnamakontak);
        tvnomor = findViewById(R.id.tvnomortelpon);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
            case "Ilaham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08133224455");
            case"Eris":
                tvnama.setText("Eris j");
                tvnomor.setText("08125533344");
            case"Fikri":
                tvnama.setText("M fikri");
                tvnomor.setText("08122453344");
            case"Mual":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
            case"Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122553444");
            case"Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125554355");
            case"Gita":
                tvnama.setText("Gina S");
                tvnomor.setText("08199233344");
            case"Vian":
                tvnama.setText("Vian");
                tvnomor.setText("08122969344");
            case"Lutfi":
                tvnama.setText("Luthi M");
                tvnomor.setText("08122222222");
        }



    }
}