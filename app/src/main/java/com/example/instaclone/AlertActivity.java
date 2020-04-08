package com.example.instaclone;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.instaclone.utils.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class AlertActivity extends AppCompatActivity {
    private static final String TAG = "AlertActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        setupBottomNAvigationView();
    }

    // BottomNavigationView Setup
    private void setupBottomNAvigationView() {
        Log.d(TAG, "setUpBottomNavigationView setting up bottom navigation view ");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomViewBar);
        BottomNavigationView.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationView.enableNavigation(AlertActivity.this,bottomNavigationViewEx);
    }
}
