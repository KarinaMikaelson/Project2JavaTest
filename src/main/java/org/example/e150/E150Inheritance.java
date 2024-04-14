package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {
        Employee e = new Employee("Joe","Smith",35);
        e.setSalary(35000);
        e.print();
        Student s = new Student("Adam","Smith",15);
        s.setGrade(10);
        s.print();;
        Retiree r = new Retiree("Frank","Smith",15);
        r.printActivity("tour");
        r.print();

    }
}
class Person{
    protected String name;
    protected String lastName;
    protected int age;
    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee extends Person{
    protected int salary;

    public Employee(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee{
    protected int grade;
    public Student (String name, String lastName, int age) {
        super(name, lastName, age);
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void print(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Student{
    protected String seniorActivity;

    public Retiree(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    public void printActivity(String seniorActivity){
        this.seniorActivity = seniorActivity;
    }
    public void print(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
