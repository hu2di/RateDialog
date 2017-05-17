package com.blogspot.hu2di.dialog.rate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.hu2di.myrate.MyRate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRate = (Button) findViewById(R.id.btnRate);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyRate(MainActivity.this, R.mipmap.ic_launcher).show();
            }
        });

        Button btnRateCs = (Button) findViewById(R.id.btnRateCs);
        btnRateCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyRate(MainActivity.this, "Comment aimeriez-vous cette application?", R.mipmap.ic_launcher, "Merci").show();
            }
        });
    }
}
