package com.example.bikesalesapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SearchBikeActivity extends AppCompatActivity implements SearchBikeActivityre {

    private BikeAdapter bikeAdapter;
    private List<Bike> bikeList;
    private List<Bike> allBikes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysearchbike);

        // Initialize UI components
        EditText searchEditText = findViewById(R.id.searchEditText);
        Button searchButton = findViewById(R.id.searchButton);
        RecyclerView searchResultsRecyclerView = findViewById(R.id.searchResultsRecyclerView);

        // Set up RecyclerView
        searchResultsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        bikeList = new ArrayList<>();
        bikeAdapter = new BikeAdapter(bikeList);
        searchResultsRecyclerView.setAdapter(bikeAdapter);

        // Initialize mock data
        initializeMockData();

        // Set up search button click listener
        searchButton.setOnClickListener(v -> {
            String query = searchEditText.getText().toString();
            searchBikes(query);
        });
    }

    /**
     * Initialize mock data for demonstration purposes.
     */
    private void initializeMockData() {
        allBikes = new ArrayList<>();
        allBikes.add(new Bike("Mountain Bike", 500.0));
        allBikes.add(new Bike("Road Bike", 700.0));
        allBikes.add(new Bike("Electric Bike", 1200.0));
    }

    /**
     * Search bikes based on the query and update the RecyclerView.
     * @param query the search query string
     */
    @SuppressLint("NotifyDataSetChanged")
    private void searchBikes(String query) {
        bikeList.clear();
        for (Bike bike : allBikes) {
            if (bike.getName().toLowerCase().contains(query.toLowerCase())) {
                bikeList.add(bike);
            }
        }
        bikeAdapter.notifyDataSetChanged();
    }
}
