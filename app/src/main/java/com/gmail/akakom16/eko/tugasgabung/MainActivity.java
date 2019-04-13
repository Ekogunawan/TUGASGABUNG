package com.gmail.akakom16.eko.tugasgabung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //TODO: Memberikan variabel untuk ke dua button
    private Button button2,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: 1 kita ambil ID yang Button
        button2 = (Button) findViewById(R.id.button2);
//TODO: 2 kita set onClick si button start
// TODO : 3 setelah kita set onClick si Button start, kita pergi ke
//TODO :4  Activity selanjutnya dengan bantuan INTENT
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, CustomView.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.button);
//TODO: 5 kita set onClick si button start
// TODO : 6 setelah kita set onClick si Button start, kita pergi ke
//TODO :7  Activity selanjutnya dengan bantuan INTENT
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent (MainActivity.this, REGISTRASI.class);
                startActivity(j);
            }
        });
    }
}
