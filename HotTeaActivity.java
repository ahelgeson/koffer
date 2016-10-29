package com.example.helgeson.koffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotTeaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_tea);


        Button buttonOne = (Button) findViewById(R.id.button14);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotTeaActivity.this,
                        HotBlackTeaActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonTwo = (Button) findViewById(R.id.button15);
        buttonTwo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotTeaActivity.this,
                        HotGreenActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonThree = (Button) findViewById(R.id.button16);
        buttonThree.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotTeaActivity.this,
                        HotHerbalActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonFour = (Button) findViewById(R.id.button17);
        buttonFour.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotTeaActivity.this,
                        HotWhiteActivity.class);
                startActivity(myIntent);

            }
        });

    }
}