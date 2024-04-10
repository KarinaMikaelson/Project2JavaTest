package org.example.e118;

public class E118JavaMethods {
    public static String spaceOut(String s){
        StringBuilder spacedOut = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            spacedOut.append(s.charAt(i)).append(" ");
        }
        return spacedOut.toString();
    }

    public static void main(String[] args) {
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
    }
}
