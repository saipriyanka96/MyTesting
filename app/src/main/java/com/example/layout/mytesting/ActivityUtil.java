package com.example.layout.mytesting;

import android.content.Context;
import android.content.Intent;

//created class Activity util
class ActivityUtil {
    private Context context;
    /*private can access withing this class
    * Context allows access to application-specific resources and classes*/
    public ActivityUtil(Context context) {
        this.context = context;//giving reference to context using this keyword
    }

    public void startSecondActivity() {
        context.startActivity(new Intent(context, SecondActivity.class));
        //here by using intent starts secondActivity
    }
}