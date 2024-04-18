package org.example.e180;

public class E180Encapsulation {
    public static void main(String[] args){
        EncapsulationDemo obj = new EncapsulationDemo();
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.print("Employee Age: "+obj.getEmpAge());
    }
}
class EncapsulationDemo{
    private String empName="John";
    private int empAge=30;
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
}



