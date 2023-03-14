package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private EditText luku1Text;
    private EditText luku2Text;
    private TextView tulos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luku1Text = findViewById(R.id.luku1);
        luku2Text = findViewById(R.id.luku2);
        tulos = findViewById(R.id.tulos);
    }
    public void summa(View view){
        if (luku1Text.getText().toString().length() == 0 || luku2Text.getText().toString().length() == 0){
            tulos.setText("Syötä luvut!");
        } else {
            int luku1 = Integer.parseInt(luku1Text.getText().toString());
            int luku2 = Integer.parseInt(luku2Text.getText().toString());
            int summa = luku1 + luku2;
            tulos.setText(Integer.toString(summa));
        }
    }

    public void erotus(View view){
        if (luku1Text.getText().toString().length() == 0 || luku2Text.getText().toString().length() == 0){
            tulos.setText("Syötä luvut!");
        } else {
            int luku1 = Integer.parseInt(luku1Text.getText().toString());
            int luku2 = Integer.parseInt(luku2Text.getText().toString());
            int erotus = luku1 - luku2;
            tulos.setText(Integer.toString(erotus));
        }
    }

    public void tulo(View view){
        if (luku1Text.getText().toString().length() == 0 || luku2Text.getText().toString().length() == 0){
            tulos.setText("Syötä luvut!");
        } else {
            int luku1 = Integer.parseInt(luku1Text.getText().toString());
            int luku2 = Integer.parseInt(luku2Text.getText().toString());
            int tulo = luku1 * luku2;
            tulos.setText(Integer.toString(tulo));
        }
    }

    public void jako(View view){
        if (luku1Text.getText().toString().length() == 0 || luku2Text.getText().toString().length() == 0){
            tulos.setText("Syötä luvut!");
        } else {
            double luku1 = Double.parseDouble(luku1Text.getText().toString());
            double luku2 = Double.parseDouble(luku2Text.getText().toString());
            if (luku1 == 0 || luku2 == 0){
                tulos.setText("0 ei voi jakaa!");
            } else {
                double jako = luku1 / luku2;
                DecimalFormat df = new DecimalFormat("#.##");
                jako = Double.valueOf(df.format(jako));
                tulos.setText(Double.toString(jako));
            }
        }
    }
}