package com.example.bikesalesapplication;

import android.annotation.SuppressLint;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public interface BikeAdapterint {
    @NonNull
    BikeAdapter.BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    @SuppressLint("SetTextI18n")
    void onBindViewHolder(@NonNull BikeAdapter.BikeViewHolder holder, int position);

    int getItemCount();
}
