package com.example.bikesalesapplication;

import android.app.Activity;

public class ViewBikeActivity extends Activity {
    Intent intent = new intent(ViewBikeActivity.this, searchBikeActivity.SearchBikeActivity);
    startActivity(intent);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewbikeactivity);

        // Retrieve the bike information from the intent extras
        Intent intent = getIntent();
        String bikeName = intent.getStringExtra("bikeName");
        String bikeModel = intent.getStringExtra("bikeModel");
        // Retrieve other bike information if needed

        // Find TextViews in your layout to display the bike information
        TextView nameTextView = findViewById(@+id/bikeNameTextView);
        TextView modelTextView = findViewById(@+id/bikeModelTextView);
        // Find other TextViews for displaying additional bike information if needed

        // Set the bike information to the TextViews
        nameTextView.setText(bikeName);
        modelTextView.setText(bikeModel);
        // Set other bike information to the corresponding TextViews if needed
    }
}
