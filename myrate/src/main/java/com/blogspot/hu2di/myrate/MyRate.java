package com.blogspot.hu2di.myrate;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by HUNGDH on 5/17/2017.
 */

public class MyRate {

    private Context context;
    private RateListener rateListener;

    private String title = "How would you like this app?";
    private int icon;
    private int stars = 0;

    public MyRate(@NonNull Context context, @NonNull RateListener rateListener,
                  @NonNull int icon) {
        this.context = context;
        this.rateListener = rateListener;

        this.icon = icon;
    }

    public MyRate(@NonNull Context context, @NonNull RateListener rateListener,
                  @NonNull String title, @NonNull int icon) {
        this.context = context;
        this.rateListener = rateListener;

        this.title = title;
        this.icon = icon;
    }

    public void show() {
        dialogRate();
    }

    private void dialogRate() {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_rate);

        TextView tvTitle;
        final ImageView ivIcon, ivOne, ivTwo, ivThree, ivFour, ivFive;

        tvTitle = (TextView) dialog.findViewById(R.id.tvTitle);
        tvTitle.setText(title);
        ivIcon = (ImageView) dialog.findViewById(R.id.ivIcon);
        ivIcon.setImageResource(icon);

        ivOne = (ImageView) dialog.findViewById(R.id.ivOne);
        ivTwo = (ImageView) dialog.findViewById(R.id.ivTwo);
        ivThree = (ImageView) dialog.findViewById(R.id.ivThree);
        ivFour = (ImageView) dialog.findViewById(R.id.ivFour);
        ivFive = (ImageView) dialog.findViewById(R.id.ivFive);

        stars = SharePref.getStars(context);
        switch (stars) {
            case 0:
                break;
            case 1:
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.star);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 2:
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 3:
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 4:
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 5:
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.stared);
                break;
        }

        ivOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.star);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);

                stars = 1;
                SharePref.putStars(context, stars);
                dialog.dismiss();
                rateListener.oneStar();
            }
        });

        ivTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);

                stars = 2;
                SharePref.putStars(context, stars);
                dialog.dismiss();
                rateListener.twoStars();
            }
        });

        ivThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);

                stars = 3;
                SharePref.putStars(context, stars);
                dialog.dismiss();
                rateListener.threeStars();
            }
        });

        ivFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.star);

                stars = 4;
                SharePref.putStars(context, stars);
                dialog.dismiss();
                rateListener.fourStars();
            }
        });

        ivFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.stared);

                stars = 5;
                SharePref.putStars(context, stars);
                dialog.dismiss();
                rateListener.fiveStars();
            }
        });

        dialog.show();
    }
}
