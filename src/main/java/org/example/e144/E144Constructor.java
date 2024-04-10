package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct eggs = new StoreProduct("Eggs",3,"Produce", true, 10);
        eggs.displayOutput();

        StoreProduct paperTowels1 = new StoreProduct("Paper Towels",2,24);
        paperTowels1.displayOutput();

        StoreProduct paperTowels2 = new StoreProduct("Paper Towels",2);
        paperTowels2.displayOutput();
    }
}
class StoreProduct{
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;
    public StoreProduct(String label,double price, String category, boolean hasExpiration, int stock){
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public StoreProduct(String label, double price, int stock){
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }
    public StoreProduct(String label, double price){
        this.label = label;
        this.price = price;
        this.category = "null";
        this.hasExpiration = false;
        this.stock = 0;
    }
    public void displayOutput(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}
