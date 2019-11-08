package com.scoliztur.creative.ui;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.scoliztur.creative.R;
import com.scoliztur.creative.ui.presenter.ControlIngredients;

import java.util.List;
import java.util.Objects;

public class ShowIngredients extends AppCompatActivity implements ControlIngredients.Action {


    private LinearLayout linearLayout;
    private Button buttonSelectIngredient;
    private Button buttonAdd;
    private AppCompatEditText setText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        controlLayout();

//        List<String> strings = new ArrayList<>();
//
//        strings.add("Phone");
//        strings.add("Mobile");
//        strings.add("Microphone");
//
//        createList(strings);


        buttonAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (!setText.getText().toString().equals("")) {
                    View viewLayout = getLayoutInflater().inflate(R.layout.select_ingredient, null);

                    buttonSelectIngredient = viewLayout.findViewById(R.id.btm_select);

                    buttonSelectIngredient.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(),
                                    setText.getText().toString(), Toast.LENGTH_SHORT).show();
                        }
                    });

                    buttonSelectIngredient.setText(Objects.requireNonNull(setText.getText()).toString());

                    linearLayout.addView(viewLayout);
                }

                Toast.makeText(getApplicationContext(),
                        "Empty text", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void controlLayout() {
        linearLayout = findViewById(R.id.ScLayout);
        buttonAdd = findViewById(R.id.bottom_confirm);
        setText = findViewById(R.id.editText_ingredient);
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
    public void getIngredient(String name) {

    }
}
