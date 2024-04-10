package org.example.e138;

public class E138AccessModifiers {

       public static void main(String[] args) {
              System.out.println(AnotherClass.returnDefault());
              System.out.println(AnotherClass.returnProtected());
              System.out.println(AnotherClass.returnPublic());
       }
}
class AnotherClass extends E138AccessModifiers{
       static String returnDefault(){
              return "default";
       }
       protected static String returnProtected(){
              return "protected";
       }
       public static String returnPublic(){
              return "public";
       }
}
