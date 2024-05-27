package com.example.bikesalesapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BikeAdapter extends RecyclerView.Adapter<BikeAdapter.BikeViewHolder> implements BikeAdapterint {

    private final List<Bike> bikeList;

    public BikeAdapter(List<Bike> bikeList) {
        this.bikeList = bikeList;
    }

    @NonNull
    @Override
    public BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bikeitem, parent, false);
        return new BikeViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BikeViewHolder holder, int position) {
        Bike bike = bikeList.get(position);
        holder.bikeNameTextView.setText(bike.getName());
        holder.bikePriceTextView.setText("Price: $" + bike.getPrice());
    }

    @Override
    public int getItemCount() {
        return bikeList.size();
    }

    public static class BikeViewHolder extends RecyclerView.ViewHolder {
        TextView bikeNameTextView;
        TextView bikePriceTextView;

        public BikeViewHolder(@NonNull View itemView) {
            super(itemView);
            bikeNameTextView = itemView.findViewById(R.id.bikeNameTextView);
            bikePriceTextView = itemView.findViewById(R.id.bikePriceTextView);
        }
    }
}
