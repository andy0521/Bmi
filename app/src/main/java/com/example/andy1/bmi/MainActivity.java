package com.example.andy1.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText edheight;
    private EditText edweight;
    private Button help;

    public void bmi(View view){


        String w = edweight.getText().toString();
        String h = edheight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity",bmi+" ");
        Toast.makeText(this,getString(R.string.your_bmi_is) +bmi,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is)+bmi)
        .setTitle("BMI")
                .setPositiveButton(R.string.ok, null)
                .setNegativeButton(R.string.clear, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        edweight.setText(" ");
                        edheight.setText(" ");

                    }



    }).show();

    }

    private void findview() {
        Log.d("MainActivity","bmi");
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "onClick:help ");
                new  AlertDialog.Builder(MainActivity.this)
                        .setMessage(R.string.bmi_info)
                .setPositiveButton(R.string.ok,null)
                        .show();

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

}
