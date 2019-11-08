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
import android.widget.TextView;
import android.widget.Toast;

import com.scoliztur.creative.R;
import com.scoliztur.creative.ui.presenter.ControlGoods;

import java.text.MessageFormat;
import java.util.Objects;

public class ShowGoods extends AppCompatActivity implements ControlGoods.Action {

    private LinearLayout linearLayout;
    private AppCompatEditText setText;
    private Button buttonAdd;
    private Button buttonSelectGoods;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        controlLayout();

//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addGood(setText.getText().toString(), 9);
//            }
//        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (!setText.getText().toString().equals("")) {
                    View viewLayout = getLayoutInflater().inflate(R.layout.select_ingredient, null);

                    buttonSelectGoods = viewLayout.findViewById(R.id.btm_select);

                    buttonSelectGoods.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(),
                                    setText.getText().toString(), Toast.LENGTH_SHORT).show();
                        }
                    });

                    buttonSelectGoods.setText(Objects.requireNonNull(setText.getText()).toString());

                    linearLayout.addView(viewLayout);
                }
            }
        });
    }

    private void controlLayout() {
        linearLayout = findViewById(R.id.ScLayout);
        setText = findViewById(R.id.editText_goods);
        buttonAdd = findViewById(R.id.bottom_confirm);
    }



    @Override
    public void addGood(String title, int sum) {

        View view = getLayoutInflater().inflate(R.layout.show_good, null);

        TextView textView = view.findViewById(R.id.view);
        textView.setText(MessageFormat.format("{0} = {1}", title, sum));

        linearLayout.addView(view);
    }
}
