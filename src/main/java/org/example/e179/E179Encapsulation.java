package org.example.e179;

public class E179Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}
class EncapsulationDemo{
    private String empName;
    public int empAge;
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int empAge){
        this.empAge = empAge;
    }
}





