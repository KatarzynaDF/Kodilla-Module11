package com.kodilla.patterns.builder.bigmac;
import java.util.ArrayList;
import java.util.List;


    public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();


        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, ingredients);
        }
    }

    public Bigmac(final String bun, final int burgers, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
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