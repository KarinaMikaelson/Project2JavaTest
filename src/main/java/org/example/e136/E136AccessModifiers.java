package org.example.e136;

public class E136AccessModifiers {
    private static void printPrivate(){
        System.out.println("This is Private Method");
    }
    static void printDefault(){
        System.out.println("This is Default Method");
    }
    protected static void printProtected(){
        System.out.println("This is Protected Method");
    }
    public static void printPublic(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        printPrivate();
        printDefault();
        printProtected();
        printPublic();

    }
}


