package com.scoliztur.creative.ui.presenter;


public class ControlIngredients {

    private Action action;

    public ControlIngredients(Action action) {
        this.action = action;
    }

    public interface Action {
        void getIngredient(String name);
    }
}
