package com.blogspot.hu2di.dialog.rate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.blogspot.hu2di.myrate.MyRate;
import com.blogspot.hu2di.myrate.RateListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRate = (Button) findViewById(R.id.btnRate);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyRate(MainActivity.this, new RateListener() {

                    @Override
                    public void oneStar() {
                        feedBack();
                    }

                    @Override
                    public void twoStars() {
                        feedBack();
                    }

                    @Override
                    public void threeStars() {
                        feedBack();
                    }

                    @Override
                    public void fourStars() {
                        rateUs();
                    }

                    @Override
                    public void fiveStars() {
                        rateUs();
                    }
                },
                        R.mipmap.ic_launcher).show();
            }
        });

        Button btnRateCs = (Button) findViewById(R.id.btnRateCs);
        btnRateCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyRate(MainActivity.this, new RateListener() {
                    @Override
                    public void oneStar() {
                        feedBack();
                    }

                    @Override
                    public void twoStars() {
                        feedBack();
                    }

                    @Override
                    public void threeStars() {
                        feedBack();
                    }

                    @Override
                    public void fourStars() {
                        rateUs();
                    }

                    @Override
                    public void fiveStars() {
                        rateUs();
                    }
                },
                        "Comment aimeriez-vous cette application?", R.mipmap.ic_launcher, "Merci").show();
            }
        });
    }

    private void rateUs() {
        final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }

    private void feedBack() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"hebitaxy@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "RateDialog Feedback");
        i.putExtra(Intent.EXTRA_TEXT, "Dear HuyHung Dinh,");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
