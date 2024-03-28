package org.example.e109;

public class E109JavaMethods {
    void newLine(){
        for(int i = 0; i < 3; i++){
            System.out.println("newLine method implementation");
        }
    }

    public static void main(String[] args) {
        E109JavaMethods str = new E109JavaMethods();
        str.newLine();
    }
}
