package com.example.android.teavarieties;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private static Button goBlack;
    private static Button goGreen;
    private static Button goWhite;
    private static Button goRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        goRed = (Button) findViewById(R.id.redButton);
        goRed.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, red_tea_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goBlack = (Button) findViewById(R.id.blackButton);
        goBlack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, white_tea_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goGreen = (Button) findViewById(R.id.greenButton);
        goGreen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, black_tea_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goWhite = (Button) findViewById(R.id.whiteButton);
        goWhite.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, green_tea_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );



    }
}
