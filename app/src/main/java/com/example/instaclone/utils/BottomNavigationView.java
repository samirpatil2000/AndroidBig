package com.example.instaclone.utils;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.example.instaclone.*;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationView {
    private static final String TAG = "BottomNavigationView";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG,"setUpBottomNavigation setting up");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx viewEx){
        viewEx.setOnNavigationItemSelectedListener(new com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.ic_house:
                        Intent intent1=new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2=new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_alert:
                        Intent intent3 =new Intent(context, AlertActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_android:
                        Intent intent4 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_circle:
                        Intent intent5= new Intent(context,ShareActivity.class);
                        context.startActivity(intent5);
                        break;

                }
                return false;
            }
        });

    }
}
