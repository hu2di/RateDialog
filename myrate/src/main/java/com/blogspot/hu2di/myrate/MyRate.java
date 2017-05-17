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

    private String title = "How would you like this app?";
    private int icon;
    private boolean isStore = true;
    private int stars = 0;
    private String rate = "Thanks for your feedback!";

    public MyRate(@NonNull Context context, @NonNull int icon) {
        this.context = context;
        this.icon = icon;
    }

    public MyRate(@NonNull Context context, @NonNull String title, @NonNull int icon, @NonNull String rateText) {
        this.context = context;
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
                if (isStore) {
                    rateUs();
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
                isStore = false;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.star);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 2:
                isStore = false;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.star);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 3:
                isStore = false;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.star);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 4:
                isStore = true;
                rlRate.setVisibility(View.VISIBLE);

                ivOne.setImageResource(R.drawable.stared);
                ivTwo.setImageResource(R.drawable.stared);
                ivThree.setImageResource(R.drawable.stared);
                ivFour.setImageResource(R.drawable.stared);
                ivFive.setImageResource(R.drawable.star);
                break;
            case 5:
                isStore = true;
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
                isStore = false;
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
                isStore = false;
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
                isStore = false;
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
                isStore = true;
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
                isStore = true;
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

    private void rateUs() {
        final String appPackageName = context.getPackageName(); // getPackageName() from Context or Activity object
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
