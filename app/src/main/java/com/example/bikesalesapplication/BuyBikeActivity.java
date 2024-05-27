package com.example.bikesalesapplication;

import static android.widget.Toast.makeText;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BuyBikeActivity extends AppCompatActivity implements BuyBikeActivityint {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();

        EditText bikeNameEditText = findViewById(R.id.bikeNameEditText);
        EditText bikePriceEditText = findViewById(R.id.bikePriceEditText);
        Button buyBikeButton = findViewById(R.id.buyBikeButton);

        buyBikeButton.setOnClickListener(v -> {
            String bikeName = bikeNameEditText.getText().toString();
            double bikePrice = Double.parseDouble(bikePriceEditText.getText().toString());

            // Logic to save bike purchase details
            // For now, show a Toast message
            Toast.makeText(BuyBikeActivity.this, "Purchased " + bikeName + " for $" + bikePrice, Toast.LENGTH_LONG).show();
        });
    }




    private void setContentView() {
    }

}

