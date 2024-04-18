package org.example.e176;


public class E176MultipleInterface {

    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
interface ParentInterface{
    void parentMethod();
}
interface ChildInterface extends ParentInterface{
    void childMethod();
}
class MyClass implements ChildInterface{
    @Override
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }
}


