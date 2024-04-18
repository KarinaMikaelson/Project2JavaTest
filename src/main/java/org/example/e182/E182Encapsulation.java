package org.example.e182;

public class E182Encapsulation {
    public static void main(String[] args){
        Person obj = new Person("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastname());
        System.out.println(obj.formatBirthday());
        System.out.println(obj.getSsn());
    }
}
class Person{
    private String firstname;
    private String lastname;
    private int birthMonth;
    private int birthday;
    private int birthYear;
    private String ssn;
    public Person(String firstname, String lastname, int birthMonth, int birthday, int birthYear, String ssn){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    public int getBirthday(){
        return birthday;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public String getSsn(){
        return ssn;
    }
    public String  formatBirthday(){
        return birthMonth+"/"+birthday+"/"+birthYear;
    }
}

