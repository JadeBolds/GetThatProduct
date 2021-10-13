package gotThatProduct;

public class Drink extends Product{
    public Drink(String name, double price, String name1, double price1, double discount_rate) {
        super(name, price, name1, price1, discount_rate);
    }

    @Override
    double calculateDiscount() {
        return 0;
    }
}
