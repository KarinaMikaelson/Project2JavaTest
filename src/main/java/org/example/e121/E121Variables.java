package org.example.e121;

public class E121Variables {
    //Instance var
    private int i;
    private double d;
    private char c;
    public E121Variables(int intValue, double doubleValue, char charValue ){
        i = intValue;
        d = doubleValue;
        c = charValue;
    }
    public static void main(String[] args) {
        E121Variables instance1 = new E121Variables(10, 10.23, 'a');
        System.out.println(instance1.i);
        System.out.println(instance1.d);
        System.out.println(instance1.c);

        E121Variables instance2 = new E121Variables(100,100.23,'s');
        System.out.println(instance2.i);
        System.out.println(instance2.d);
        System.out.println(instance2.c);
    }
}
