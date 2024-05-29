package com.example.bikesalesapplication;

public class Bike {
    private String name;
    private double price;

    public Bike(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    Intent intent =new Intent (Bike.this, ViewBikeActivity.class)
            intent.putExtra("bikeName",bike.getName());
            intent.putExtra("bikeModel",bike.getName());
            startActivity(intent);
}
