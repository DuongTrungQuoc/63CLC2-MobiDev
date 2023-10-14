package com.duongtrungquoc.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsQuocGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b0
        findControls();
        //b1.Chuan bi nguon du lieu,cat vao bien
        dsQuocGia = new ArrayList<String>();
        dsQuocGia.add("VietNam");dsQuocGia.add("USA");dsQuocGia.add("Australia");
        dsQuocGia.add("Endland");dsQuocGia.add("Agreria");dsQuocGia.add("Albania");
        //b2.Tao adapter
        ArrayAdapter<String> adapterQG;
        adapterQG = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line
                ,dsQuocGia);// nguon du lieu
        //b3. gan adapter
        autoQUOCGIA.setAdapter(adapterQG);
    }
    public void findControls()
    {
        autoQUOCGIA = findViewById(R.id.autoCompleteQUOCGIA);
    }
    AutoCompleteTextView autoQUOCGIA;
}