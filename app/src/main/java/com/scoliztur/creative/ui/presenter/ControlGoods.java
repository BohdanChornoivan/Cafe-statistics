package com.scoliztur.creative.ui.presenter;

public class ControlGoods {

    private Action action;

    public ControlGoods(Action action) {
        this.action = action;
    }

    public interface Action {
        void addGood(String title, int sum);
    }
}
