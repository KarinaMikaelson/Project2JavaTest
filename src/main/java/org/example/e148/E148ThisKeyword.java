package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args){
        ShoppingStore blanket = new ShoppingStore("Blanket",49.99,2);
        ShoppingStore mattress = new ShoppingStore("Mattress",219.59,2);

        double blanketTotal = blanket.itemTotalPrice();
        double mattressTotal = mattress.itemTotalPrice();
        double totalPurchase = blanketTotal + mattressTotal;
        System.out.println("You purchased "+totalPurchase+" Today");
    }
}
class ShoppingStore{
    private String item;
    private double price;
    private int quantity;
    public ShoppingStore(String item, double price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public double itemTotalPrice(){
        double totalValue = price * quantity;
        System.out.println(item+" Total Value "+ totalValue);
        return totalValue;
    }
}
   