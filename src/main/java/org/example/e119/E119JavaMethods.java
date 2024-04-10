package org.example.e119;
/*
Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
 */
public class E119JavaMethods {
    public static String censorLetter(String a, char c){
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < a.length(); i++){
            if(a.charAt(i) == c){
                result.append('*');
            }else {
                result.append(a.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("trick or treat",'t'));
    }

}
