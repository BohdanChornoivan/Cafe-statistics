package com.scoliztur.creative.logic;

import java.util.Map;

public class Cooking {

    private Warehouse warehouse;

    public Cooking(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String make(Recipe recipe, String meat) {
        if(isCook(recipe, meat)) {
            for (Ingredient ingredient : recipe.info(meat)) {
                for (Map.Entry<String, Integer> integerEntry : warehouse.getIngredientValue().entrySet()) {
                    if(ingredient.getName().equals(integerEntry.getKey())) {
                        warehouse.removeValue(integerEntry.getKey(), ingredient.getNumber());
                    }
                }
            }
            return "done";
        } else {
            return "no done";
        }
    }

    private boolean isCook(Recipe recipe, String meat) {
        int sizeIngredients = recipe.info(meat).size();
        int count = 0;

        for (Ingredient ingredient : recipe.info(meat)) {
            for (Map.Entry<String, Integer> integerEntry : warehouse.getIngredientValue().entrySet()) {
                if(ingredient.getName().equals(integerEntry.getKey())) {
                    count++;
                }
            }
        }

        return count == sizeIngredients;
    }
}
