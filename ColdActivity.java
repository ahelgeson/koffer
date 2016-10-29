package com.example.helgeson.koffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold);

        Button buttonOne = (Button) findViewById(R.id.button4);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(ColdActivity.this,
                        HotCoffeeActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonTwo = (Button) findViewById(R.id.button9);
        buttonTwo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(ColdActivity.this,
                        HotTeaActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonThree = (Button) findViewById(R.id.button10);
        buttonThree.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(ColdActivity.this,
                        ColdSpecialActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
