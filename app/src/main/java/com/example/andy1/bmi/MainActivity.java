package com.example.andy1.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText edheight;
    private EditText edweight;

    public void bmi(View view){
        Log.d("MainActivity","bmi");
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);

        String w = edweight.getText().toString();
        String h = edheight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity",bmi+" ");
        Toast.makeText(this,"Your BmI is " +bmi,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage("Your BmI is "+bmi)
        .setTitle("BMI")
                .setPositiveButton("Ok", null)
                .setNegativeButton("clear", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        edweight.setText(" ");
                        edheight.setText(" ");

                    }



    }).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
