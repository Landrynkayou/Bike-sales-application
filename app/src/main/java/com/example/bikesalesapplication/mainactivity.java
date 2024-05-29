package com.example.bikesalesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
    }

    // Method to navigate to BikeItemActivity
    public void goToBikeItemActivity(View view) {
        Intent intent = new Intent(this, Bike.class);
        startActivity(intent);
    }

    // Method to navigate to ViewBikeActivity
    public void goToViewBikeActivity(View view) {
        Intent intent = new Intent(this, ViewBikeActivity.class);
        startActivity(intent);
    }

    // Method to navigate to SearchActivity
    public void goToSearchActivity(View view) {
        Intent intent = new Intent(this, SearchBikeActivity.class);
        startActivity(intent);
    }
}
