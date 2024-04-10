package org.example.e126;

public class E126Variables {
    static int count = 0;
    public E126Variables() {
        count++;
    }
    public static void main(String[] args) {
        E126Variables obj1 = new E126Variables();
        E126Variables obj2 = new E126Variables();
        E126Variables obj3 = new E126Variables();
        System.out.println(count);
    }
}
