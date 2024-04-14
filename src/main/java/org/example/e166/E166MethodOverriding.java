package org.example.e166;

public class E166MethodOverriding {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat");
        animals[1] = new Kitten1();
        animals[2] = new Kitten2();
        animals[3] = new Kitten3();

        animals[0].eat();
        animals[0].sleep();
        animals[1].eat();
        animals[1].sleep();
        animals[2].eat();
        animals[2].sleep();
        animals[3].eat();
        animals[3].sleep();
    }
}
class Animal{
    protected String animal;
    Animal(String animal){
        this.animal = animal;
    }
    public void eat(){
        System.out.println(animal+" eats");
    }
    public void sleep(){
        System.out.println(animal+" sleeps a lot");
    }
}
class Cat extends Animal{
    public Cat(String animal){
        super(animal);
        animal = "Cat";
    }
    @Override
    public void sleep(){
        System.out.println(animal+" sleeps a lot");
    }
}
class Kitten1 extends Cat{
    public Kitten1(){
        super("kitten1");
    }
    @Override
    public void eat(){
        System.out.println("kitten1 eats milk");
    }
}
class Kitten2 extends Cat{
    public Kitten2(){
        super("kitten2");
    }
    @Override
    public void eat(){
        System.out.println("kitten2 eats snacks");
    }
}
class Kitten3 extends Cat{
    public Kitten3(){
        super("kitten3");
    }
    @Override
    public void eat(){
        System.out.println("kitten3 eats everything");
    }
}
