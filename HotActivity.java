package com.example.helgeson.koffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot);

        Button buttonOne = (Button) findViewById(R.id.bOptionThree);
        buttonOne.setOnClickListener(new Button.OnClickListener () {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotActivity.this,
                        HotCoffeeActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonTwo = (Button) findViewById(R.id.bOptionFour);
        buttonTwo.setOnClickListener(new Button.OnClickListener () {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotActivity.this,
                        HotTeaActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonThree = (Button) findViewById(R.id.button18);
        buttonThree.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HotActivity.this,
                        HotSpecialActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
