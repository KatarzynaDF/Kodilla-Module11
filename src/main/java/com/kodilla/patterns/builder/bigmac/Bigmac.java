package com.kodilla.patterns.builder.bigmac;
import java.util.ArrayList;
import java.util.List;


public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final List<String> ingredients = new ArrayList<>();

    public Bigmac(final String bun, final int burgers, final String... ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        for (int n = 0; n < ingredients.length; n++) {
            this.ingredients.add(ingredients[n]);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}