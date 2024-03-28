package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String str = sb.toString().toUpperCase();
        System.out.println(str);
    }
}

