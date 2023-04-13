package com.cyrilla202102337.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2, spinner3, spinner4, spinner5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
        initSpinner5();
    }

    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,buahList);
        spinner1.setAdapter(arrayAdapter);
    }

    private void initSpinner2() {
        List<String> mahasiswaList = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            mahasiswaList.add("Mahasiswa ke-"+i);
        }

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        spinner2.setAdapter(arrayAdapter2);
    }

    private void initSpinner3() {
        List<String> ganjilList = new ArrayList<>();

        for (int i = 1; i <= 999; i+=2) {
            ganjilList.add("Bilangan ke-"+i);
        }

        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        spinner3.setAdapter(arrayAdapter3);
    }

    private void initSpinner4() {
        List<String> genapList = new ArrayList<>();

        for (int i = 1; i <= 1000; i+=2) {
            genapList.add("Bilangan ke-"+i);
        }

        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        spinner4.setAdapter(arrayAdapter4);
    }

    private void initSpinner5() {
        List<String> bungaList = new ArrayList<>();
        bungaList.add("Mawar");
        bungaList.add("Melati");
        bungaList.add("Anggrek");
        bungaList.add("Kamboja");
        bungaList.add("Lily");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,bungaList);
        spinner5.setAdapter(arrayAdapter);
    }
}