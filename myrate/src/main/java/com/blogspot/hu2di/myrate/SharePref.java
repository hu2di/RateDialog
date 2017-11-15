package com.blogspot.hu2di.myrate;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by HUNGDH on 5/17/2017.
 */

class SharePref {

    private static final String M_KEY = "com.blogspot.hu2di.myrate";
    private static final String STARS = "stars";

    static int getStars(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(M_KEY, Context.MODE_PRIVATE);
        return preferences.getInt(STARS, 0);
    }

    static boolean putStars(Context context, int value) {
        SharedPreferences preferences = context.getSharedPreferences(M_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(STARS, value);
        return editor.commit();
    }
}
