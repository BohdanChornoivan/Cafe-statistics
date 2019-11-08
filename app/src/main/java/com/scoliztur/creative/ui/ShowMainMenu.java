package com.scoliztur.creative.ui;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.scoliztur.creative.R;
import com.scoliztur.creative.data.ControlLogic;
import com.scoliztur.creative.logic.Warehouse;

import java.util.HashMap;

public class ShowMainMenu extends AppCompatActivity {

    private ControlLogic controlLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        controlLogic();
    }

    private void controlLogic() {
        controlLogic = new ControlLogic();
        controlLogic.ingredientValue = new HashMap<>();
        controlLogic.recipeData = new HashMap<>();
        controlLogic.warehouse = new Warehouse(controlLogic.ingredientValue);
    }


    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {

            case R.id.balance:
                intent = new Intent(this, ShowBalance.class);
                startActivity(intent);
                break;

            case R.id.ingredients:
                intent = new Intent(this, ShowIngredients.class);
                startActivity(intent);
                break;

            case R.id.goods:
                intent = new Intent(this, ShowGoods.class);
                startActivity(intent);
                break;

            case R.id.costs:
                intent = new Intent(this, ShowCosts.class);
                startActivity(intent);
                break;
        }
    }
}
