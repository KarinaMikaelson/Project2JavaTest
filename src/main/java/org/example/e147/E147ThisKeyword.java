package org.example.e147;

public class E147ThisKeyword {

    public static void main(String[] args) {
        carObject toyota = new carObject("Toyota 2019",50000, 50);
        carObject bmw = new carObject("BMW 2019",13059.6,50);
        toyota.carStockValue();
        bmw.carStockValue();
    }
}
class carObject{
    private String model;
    private double price;
    private int quantity;

    public carObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public void carStockValue(){
        double stockValue = price * quantity;
        System.out.println(model+" Stock Value "+stockValue);
    }
}
