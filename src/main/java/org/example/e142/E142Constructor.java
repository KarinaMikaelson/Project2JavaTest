package org.example.e142;
/*
Complete the SyntaxTechnologies class:
Include the following class variables:
schoolName(String)
batch(int)
year(int)
lastDayOfClass(String)
Write two constructors:
non-argument constructor
parameterized constructor
Create method to display values of instance variables.
2. In Main Class:
Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
**Output:**
null 0 0 null
Syntax 6 2020 07/30/2020
 */
public class E142Constructor {
    public static void main(String[] args) {
        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        obj1.display();
        SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax",6,2020,"07/30/2020");
        obj2.display();
    }
}
class SyntaxTechnologies{
    private String schoolName;
    private String lastDayOfClass;
    private int batch;
    private int year;
    public SyntaxTechnologies(){

    }
    public SyntaxTechnologies(String schoolName,int batch, int year, String lastDayOfClass ){
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
    public void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
