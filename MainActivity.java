package com.example.helgeson.koffer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.button32);
        buttonOne.setOnClickListener(new Button.OnClickListener () {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        HotActivity.class);
                startActivity(myIntent);

            }
        });

        Button buttonTwo = (Button) findViewById(R.id.button33);
        buttonTwo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        ColdActivity.class);
                startActivity(myIntent);

            }
        });
    }
}