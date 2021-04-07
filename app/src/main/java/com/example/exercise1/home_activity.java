package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class home_activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener  {

    private ListView list;
    private ListViewAdapter adapter;
    String[] listNama;
    public static ArrayList<Class_nama> classNamaArrayList = new ArrayList<Class_nama>();
    Bundle bundle = new Bundle();
    Intent intent;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        listNama = new String[]{"Inayah", "Ilaham", "Eris", "Fikri", "Mual", "Intan", "Vina", "Gita", "Vian", "Lutfi"};

        list = findViewById(R.id.listkontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listNama.length; i++) {
            Class_nama classNama = new Class_nama(listNama[i]);
            classNamaArrayList.add(classNama);

            adapter = new ListViewAdapter(this);

            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String nama = classNamaArrayList.get(position).getNama();
                    bundle.putString("a", nama.trim());
                    PopupMenu pm = new PopupMenu(getApplicationContext(), view);
                    pm.setOnMenuItemClickListener(home_activity.this);
                    pm.inflate(R.menu.popup_menu);
                    pm.show();
                }
            });
        }
    }



    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.Lihatdata:
                intent = new Intent(getApplicationContext(),activitylihatdata.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.Lihatnomor:
                Toast.makeText(getApplicationContext(), "editnomor",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

}