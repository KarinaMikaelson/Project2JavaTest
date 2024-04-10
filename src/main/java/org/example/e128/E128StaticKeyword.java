package org.example.e128;

public class E128StaticKeyword {
    static String mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Strings must be same length";
        }
        StringBuilder mixString = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            mixString.append(s1.charAt(i));
            mixString.append(s2.charAt(i));
        }
        return mixString.toString();
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";
        System.out.println(mixString(s1,s2));
    }
}
