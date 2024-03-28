package org.example.e107;

public class E107StringBuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Friends");
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
