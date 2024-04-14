package org.example.e158;

public class E158SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child("Fairfax");
        child.display();
    }
}
class Parent{
    String city;
    Parent(String city){
        this.city = city;
    }
    public void display(){
        System.out.println("City name "+city);
    }
}
class Child extends Parent{
    Child(String city){
        super(city);
    }
}


