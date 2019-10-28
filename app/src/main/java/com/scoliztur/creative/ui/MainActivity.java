package com.scoliztur.creative.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.scoliztur.creative.R;
import com.scoliztur.creative.ui.fragment.ViewIngredient;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragment;

    private Button addIngredient;
    private Button view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = getSupportFragmentManager();
        controlLayout();
        controlButton();
    }

    private void controlLayout() {
        addIngredient = findViewById(R.id.add_ingredient);
        view = findViewById(R.id.view);
    }

    private void controlButton() {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new ViewIngredient());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        this.fragment
                .beginTransaction()
                .replace(R.id.view_fragment, fragment)
                .addToBackStack(null)
                .commit();
    }
}
