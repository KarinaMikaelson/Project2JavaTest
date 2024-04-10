package org.example.e143;

public class E143Constructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Prius", 4,120, 30000.0);
        car1.display();
        Car car2 = new Car("Toyota","Prius",120,30000.0);
        car2.display();
        Car car3 = new Car(4, 120, 30000.0);
        car3.display();

        Car car4 = new Car("Toyota", "Prius", 4);
        car4.display();
    }
}
class Car{
    protected String make;
    protected String model;
    protected int numberOfDoors;
    protected int topSpeed;
    protected double price;

    public Car(String make, String model, int numberOfDoors,int topSpeed, double price ){
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        this.numberOfDoors = numberOfDoors;
    }
    public Car(String make,String model,int topSpeed,double price){
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        this.numberOfDoors = 4;
    }
    public Car(int numberOfDoors,int topSpeed,double price){
        this.make = "unknown" ;
        this.model = "unknown" ;
        this.topSpeed = topSpeed;
        this.price = price;
        this.numberOfDoors = numberOfDoors;
    }
    public Car(String make,String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.topSpeed = 90;
        this.price = 0;
        this.numberOfDoors = numberOfDoors;
    }

    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}




