package com.example.andy1.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public void bmi(View view){
        Log.d("MainActivity","bmi");
        EditText edweight = findViewById(R.id.ed_weight);
        EditText edheight = findViewById(R.id.ed_height);

        String w = edweight.getText().toString();
        String h = edheight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity","bmi"+" ");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
