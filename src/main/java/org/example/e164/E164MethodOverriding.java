package org.example.e164;

public class E164MethodOverriding {
    public static void main(String[] args) {
        Parent [] arr = {new Child1(),new Child2(), new Child3()};
        arr[0] =new Child1();
        arr[1] = new Child2();
        arr[2] = new Child3();
        for(Parent child: arr){
            child.hello();
        }
    }
}
class Parent{
    public void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends Parent{
    @Override
    public void hello(){
        System.out.println("method in Child1 class");
    }
}
class Child2 extends Parent{
    @Override
    public void hello(){
        System.out.println("method in Child2 class");
    }
}
class Child3 extends Parent{
    @Override
    public void hello(){
        System.out.println("method in Child3 class");
    }
}

