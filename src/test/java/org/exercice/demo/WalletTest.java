package org.exercice.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WalletTest {

    private Wallet wallet;

    @BeforeEach
    public void setUp() {
        wallet = new Wallet();
    }

    @Test
    public void testAddPositiveAmount() {
        wallet.addVola(50.0);
        Assertions.assertEquals(50.0, wallet.getVola(), "Balance should be 50.0 after adding 50.0");
    }

    @Test
    public void testAddMultipleAmounts() {
        wallet.addVola(10.0);
        wallet.addVola(2.50);
        Assertions.assertEquals(12.50, wallet.getVola(), "Balance should be 12.50");
    }

    @Test
    public void testAddNegativeAmount() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            wallet.addVola(-20.0);
        }, "Should throw IllegalArgumentException when adding a negative amount");
    }
}
