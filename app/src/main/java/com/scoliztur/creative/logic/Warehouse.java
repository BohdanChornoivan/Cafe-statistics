package com.scoliztur.creative.logic;

import java.util.Map;

public class Warehouse {

    private Map<String, Integer> ingredientValue;

    public Warehouse(Map<String, Integer> ingredientValue) {
        this.ingredientValue = ingredientValue;
    }

    public void addIngredient(String ingredient, int sum) {
        ingredientValue.put(ingredient, sum);
    }

    public void removeValue(String ingredient, int taken) {

        int takenAway = ingredientValue.get(ingredient) - taken;

        ingredientValue.put(ingredient, takenAway);
    }

    public Map<String, Integer> getIngredientValue() {
        return ingredientValue;
    }

    public void setIngredientValue(Map<String, Integer> ingredientValue) {
        this.ingredientValue = ingredientValue;
    }
}
