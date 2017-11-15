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
    private String rate = "Submit";

    public MyRate(@NonNull Context context, @NonNull RateListener rateListener,
                  @NonNull int icon) {
        this.context = context;
        this.rateListener = rateListener;

        this.icon = icon;
    }

    public MyRate(@NonNull Context context, @NonNull RateListener rateListener,
                  @NonNull String title, @NonNull int icon, @NonNull String rateText) {
        this.context = context;
        this.rateListener = rateListener;

        this.title = title;
        this.icon = icon;
        this.rate = rateText;
    }

    public void show() {
        dialogRate();
    }

    private void dialogRate() {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_rate);

        TextView tvTitle, tvRate;
        final ImageView ivIcon, ivOne, ivTwo, ivThree, ivFour, ivFive;
        final RelativeLayout rlRate;

        tvTitle = (TextView) dialog.findViewById(R.id.tvTitle);
        tvTitle.setText(title);
        ivIcon = (ImageView) dialog.findViewById(R.id.ivIcon);
        ivIcon.setImageResource(icon);

        rlRate = (RelativeLayout) dialog.findViewById(R.id.rlRate);
        tvRate = (TextView) dialog.findViewById(R.id.tvRate);
        tvRate.setText(rate);
        tvRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (stars) {
                    case 0:
                        break;
                    case 1:
                        rateListener.oneStar();
                        break;
                    case 2:
                        rateListener.twoStars();
                        break;
                    case 3:
                        rateListener.threeStars();
                        break;
                    case 4:
                        rateListener.fourStars();
                        break;
                    case 5:
                        rateListener.fiveStars();
                        break;
                }

                SharePref.putStars(context, stars);
                dialog.dismiss();
            }
        });


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
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.star);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 2:
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 3:
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 4:
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 5:
                rlRate.setVisibility(View.VISIBLE);

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
                stars = 1;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.star);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
            }
        });

        ivTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stars = 2;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
            }
        });

        ivThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stars = 3;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
            }
        });

        ivFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stars = 4;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.star);
            }
        });

        ivFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stars = 5;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.stared);
            }
        });

        dialog.show();
    }
}
