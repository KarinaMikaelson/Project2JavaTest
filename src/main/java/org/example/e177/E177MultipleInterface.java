package org.example.e177;
/*
Create two interfaces
1. iOutputs - which has un-implemented method  display(double myResult)
2. iFunctions  - which has un-implemented method
   double adding(double firstNumber , double secondNumber);
   double subtracting(double firstNumber , double secondNumber);
   double multiply(double firstNumber , double secondNumber);
   double dividing(double firstNumber , double secondNumber);
   and also iFunctions inherits iOutputs
Now, write a class which will implement  the iFunctions and print the below output
Note : display () method is utilized to print the result
**Output:**
Result is ::: 120.0
Result is ::: 80.0
Result is ::: 2000.0
Result is ::: 5.0
 */
public class E177MultipleInterface {

    public static void main(String[] args){
        iClass calculator = new iClass();
        double result1 = calculator.adding(50,70);
        double result2 = calculator.subtracting(100,20);
        double result3 = calculator.multiply(50,40);
        double result4 =calculator.dividing(10,2);
        calculator.display(result1);
        calculator.display(result2);
        calculator.display(result3);
        calculator.display(result4);
    }
}
interface iOutputs{
    void display(double myResult);
}
interface iFunctions extends iOutputs{
    double adding(double firstNumber , double secondNumber);
    double subtracting(double firstNumber , double secondNumber);
    double multiply(double firstNumber , double secondNumber);
    double dividing(double firstNumber , double secondNumber);
}
class iClass implements iFunctions{
    @Override
    public double adding(double firstNumber , double secondNumber){
        return firstNumber + secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
    @Override
    public double multiply(double firstNumber , double secondNumber){
        return firstNumber * secondNumber;
    }
    @Override
    public double dividing(double firstNumber , double secondNumber){
        return firstNumber / secondNumber;
    }
    @Override
    public void display(double myResult){
        System.out.println("Result is ::: "+myResult);
    }
}
