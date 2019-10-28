package com.scoliztur.creative.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recipe {

    private Map<String, List<Ingredient>> recipeData;

    public Recipe(Map<String, List<Ingredient>> recipeData) {
        this.recipeData = recipeData;
    }

    public Recipe() {
        recipeData = new HashMap<>();
    }

    public void addRecipe(String recipe, Map<String, Integer> neededIngredient) {

        List<Ingredient> internal = new ArrayList<>();
        for (Map.Entry<String, Integer> integerEntry : neededIngredient.entrySet() ){
            Ingredient ingredient = new Ingredient(integerEntry.getKey(), integerEntry.getValue());
            internal.add(ingredient);
        }
        recipeData.put(recipe, internal);
    }

    public List<Ingredient> info(String meat) {

        return recipeData.get(meat);
    }
}
