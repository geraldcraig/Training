package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class AdderTest {

    @Test
    public void simpleTest() {

        Adder adder = new Adder();

        assertEquals("1 + 1 is 2", 2, adder.add(1, 1));
    }

    @Test
    public void orderTest() {

         Adder adder = new Adder();

         assertEquals("Order does not matter ", 5, adder.add(2, 3));
         assertEquals("Order does not matter ", 5, adder.add(3, 2));
    }

}
