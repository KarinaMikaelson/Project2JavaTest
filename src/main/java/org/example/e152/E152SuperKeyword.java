package org.example.e152;

public class E152SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child("Vienna");
    }
}
class Parent{
    protected String city;
    public Parent(String city){
        this.city = city;
        System.out.println(city);
    }
    public Parent(){
        System.out.println(city);
    };
    public void print(){
        System.out.println(city);
    }
}
class Child extends Parent{
    public Child(String city){
        super(city);
    }
}

