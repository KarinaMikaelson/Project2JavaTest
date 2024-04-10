package org.example.e146;

public class E146ThisKeyword {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.print();
        Employee obj2 = new Employee("Joe","Smith",12345, "01/01/1970",35000);
        obj2.print();
    }
}
class Employee{
    private static String name;
    private static String lastName;
    private static int employeeId;
    private static String startDate;
    private static int salary;
    public Employee(){
    }
    public Employee(String name, String lastName, int employeeId, String startDate, int salary){
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }
    public void print(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }

}
