package com.example.a18077431_nguyenphanhuynhduc_android_tuan3;

import java.io.Serializable;

public class Phone implements Serializable {
    private String name;
    private String color;
    private double price;
    private String supplier;
    private int image;

    public Phone(String name, String color, double price, String supplier, int image) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.supplier = supplier;
        this.image = image;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                ", image=" + image +
                '}';
    }
}

