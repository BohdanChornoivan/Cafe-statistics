package com.scoliztur.creative.ui;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.scoliztur.creative.R;
import com.scoliztur.creative.ui.presenter.PresenterShowIngredients;

import java.util.ArrayList;
import java.util.List;

public class ShowIngredients extends AppCompatActivity implements PresenterShowIngredients.ControlListIngredient {

//    private FragmentManager fragment;

    private LinearLayout linearLayout;
    private Button buttonSelectIngredient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        List<String> strings = new ArrayList<>();

        strings.add("Phone");
        strings.add("Mobile");
        strings.add("Microphone");
        strings.add("DC");
        strings.add("MC");
        strings.add("PC");
        strings.add("Nokia");
        strings.add("BlackBerry");
        strings.add("Xiaomi");
        strings.add("Sumsung");
        strings.add("Microsoft");

        controlLayout();

        createList(strings);
//        fragment = getSupportFragmentManager();
//
//        if(savedInstanceState == null) {
//            formForFragment(new ViewIngredient());
//        }


    }

//    private void formForFragment(Fragment fragment) {
//        this.fragment
//                .beginTransaction()
//                .add(R.id.fragment, fragment)
//                .commit();
//    }


    private void controlLayout() {
        linearLayout = findViewById(R.id.ScLayout);
    }

    private void createList(List<String> list) {

        for (int i = 0; i < list.size(); i++) {

            View view = getLayoutInflater().inflate(R.layout.select_ingredient, null);

            buttonSelectIngredient = view.findViewById(R.id.btm_select);

            buttonSelectIngredient.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });

            buttonSelectIngredient.setText(list.get(i));

            linearLayout.addView(view);
        }
    }

    @Override
    public void getIngredient(int number) {

    }
}
