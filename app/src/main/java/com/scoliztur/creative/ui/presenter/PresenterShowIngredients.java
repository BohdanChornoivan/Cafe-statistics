package com.scoliztur.creative.ui.presenter;


public class PresenterShowIngredients {

    private ControlListIngredient controlListIngredient;

    public PresenterShowIngredients(ControlListIngredient controlListIngredient) {
        this.controlListIngredient = controlListIngredient;
    }

    public interface ControlListIngredient {
        void getIngredient(int number);
    }
}
