package com.scoliztur.creative.ui;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.scoliztur.creative.R;
import com.scoliztur.creative.ui.fragment.ViewIngredient;

public class ShowMainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
