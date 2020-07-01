package com.example.convertex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnone(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        String dollars = dollarAmount.getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleINR = 75.51 * doubleDollars;
        String toastText = "= " + doubleINR.toString() + "Rs.";

        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();

    }

    public void btntwo(View view){
        EditText inrAmount = (EditText) findViewById(R.id.inrAmount);
        String inrs = inrAmount.getText().toString();
        Double doubleInr = Double.parseDouble(inrs);
        Double doubleDOLLARS = doubleInr / 75.51;
        String toastTextt = "= " + doubleDOLLARS.toString() + "$";

        Toast.makeText(this, toastTextt, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}