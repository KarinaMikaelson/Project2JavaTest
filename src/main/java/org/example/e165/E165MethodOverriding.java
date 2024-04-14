package org.example.e165;

public class E165MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.printPublic();
        child.printProtected();
        child.printDefault();
    }
}
class Parent{
    public void printPublic(){
        System.out.println("I am parent public method");
    }
    protected void printProtected(){
        System.out.println("I am parent protected method");
    }
    void printDefault(){
        System.out.println("I am parent default method");
    }
    private void printPrivate(){
        System.out.println("I am parent private method");
    }
}
class Child extends Parent{
    @Override
    public void printPublic(){
        System.out.println("I am a child public method");
    }
    @Override
    protected void printProtected(){
        System.out.println("I am a child protected method");
    }
    @Override
    void printDefault(){
        System.out.println("I am a child default method");
    }
    /*
    @Override
    private void printPrivate(){
        System.out.println("I am a child private method");
    }
     */
}
