package gotThatProduct;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    protected ExpirationDate expirationDate;
    public final double DISCOUNT_RATE;

    public Product(String name, double price, String name1, double price1, double discount_rate){
        this.name = name1;

        this.price = price1;
        DISCOUNT_RATE = discount_rate;
    }

    public void printExpirationDate(Product product){}

    public String printIngredients(String[] ingredients){
        return null;
    }

    abstract double calculateDiscount();

    public void printOrder(Product[] products) {

    }

    public void printConsumptionQty(ArrayList<Consumable> consumables) {

    }
}
