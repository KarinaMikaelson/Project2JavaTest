package org.example.e173;

public class E173AbstractClass {
    public static void main(String[] args) {
        LemonTea lemonTea = new LemonTea();
        ChaiTea chaiTea = new ChaiTea();
        lemonTea.addSugar();
        chaiTea.addSugar();

    }
}
abstract class Tea{
    protected String teaType;
    public Tea(String teaType){
        this.teaType = teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea{
    LemonTea(){
        super("Lemon Tea");
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(){
        super("Chai Tea");
    }
    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }

}


