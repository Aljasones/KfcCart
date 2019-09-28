package ru.itpark;

public class CartService {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void add (Burger burger) {
        add(burger, 1);
    }
    public void add (Burger burger, int count) {
         amount += burger.getPrice() * count;
    }
}
