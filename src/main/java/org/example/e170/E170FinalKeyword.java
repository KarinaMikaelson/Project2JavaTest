package org.example.e170;

public class E170FinalKeyword {
    public final void callFinalMethod(boolean b){
        System.out.println("Final method with boolean parameter");
    }
    public final void callFinalMethod(String str){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args){
        E170FinalKeyword instance = new E170FinalKeyword();
        instance.callFinalMethod(true);
        instance.callFinalMethod("Hello");
    }
}
