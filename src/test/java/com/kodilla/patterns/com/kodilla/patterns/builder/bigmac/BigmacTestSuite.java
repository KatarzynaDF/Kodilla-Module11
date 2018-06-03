package com.kodilla.patterns.com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;


public class BigmacTestSuite {

    @Test
    public void testBigMacIngredients() {
        //Given
        Bigmac bigmac = new Bigmac("WithSesame", 2, "Cheese", "Cucomber", "Salad", "Tomato");
        System.out.println(bigmac);
        //When
        int ingredientsQty = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, ingredientsQty);
    }

    @Test
    public void testBigMacBun() {
        //Given
        Bigmac bigmac = new Bigmac("WithSesame", 2, "Cheese", "Cucomber", "Salad", "Tomato");
        System.out.println(bigmac);
        //When
        String bunType = bigmac.getBun();
        //Then
        Assert.assertEquals("WithSesame", bunType);
    }

    @Test
    public void testBigMacBurgersQTY() {
        //Given
        Bigmac bigmac = new Bigmac("WithSesame", 2, "Cheese", "Cucomber", "Salad", "Tomato");
        System.out.println(bigmac);
        //When
        int burgersQty = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, burgersQty);
    }
}

