package com.kodilla.patterns.com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;


public class BigmacTestSuite {

    @Test
    public void testNewBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("WithSesame")
                .burgers(2)
                .ingredient("Cheese")
                .ingredient("Cucomber")
                .ingredient("Salad")
                .ingredient("Tomato")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientQTY = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, ingredientQTY);
    }
}

