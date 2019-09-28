package ru.itpark;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartServiceTest {
    @Test
    public void shouldAddOne () {

        Burger hotDog = new Burger(
                2379,
                79,
                "Хот дог",
                "..."
        );
        CartService service = new CartService();

        service.add(hotDog);

        assertEquals(hotDog.getPrice(), service.getAmount());
    }
    @Test
    public void shouldAddMore () {

        Burger hotDog = new Burger(
                2379,
                79,
                "Хот дог",
                "..."
        );
        CartService service = new CartService();

        service.add(hotDog, 5);

        assertEquals(hotDog.getPrice() * 5, service.getAmount());
    }
}
