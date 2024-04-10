package org.example.e145;

public class E145ThisKeyword {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tarzan",50);
        Dog dog2 = new Dog("Lucy",10);
        dog1.displayInfo();
        dog2.displayInfo();
    }

}
class Dog{
    private String dogName;
    private double dogWeight;
    static String dogBreed = "Mutt";
    public Dog(String dogName, double dogWeight){
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    public void displayInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}
