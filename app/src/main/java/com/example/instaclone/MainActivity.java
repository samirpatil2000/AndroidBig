package com.example.instaclone;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.instaclone.utils.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate Starting");
        // setupBottomNAvigationView();
        setupBottomNAvigationView();
    }


        // BottomNavigationView Setup
        private void setupBottomNAvigationView() {
            Log.d(TAG, "setUpBottomNavigationView setting up bottom navigation view ");
            BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomViewBar);
            BottomNavigationView.setupBottomNavigationView(bottomNavigationViewEx);
            BottomNavigationView.enableNavigation(MainActivity.this,bottomNavigationViewEx);
        }
}
