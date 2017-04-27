package com.kosalgeek.android.androidphpmysqlvolley;


import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("pid")
    public int pid;
    @SerializedName("name")
    public String name;
    @SerializedName("qty")
    public int qty;
    @SerializedName("price")
    public double price;
    @SerializedName("image_url")
    public String image_url;
}
