package com.company;

public class Car2 {
    private int year; //  jyly
    private String model; // modeli
    private int price;   // akchasy
    private String color; // tusu

    public Car2(int issue, String model, int price, String color) {
        this.year = issue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Meaning{" +
                "issue=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}