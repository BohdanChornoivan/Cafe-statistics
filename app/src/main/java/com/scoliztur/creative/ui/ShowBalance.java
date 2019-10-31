package com.scoliztur.creative.ui;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.scoliztur.creative.R;

public class ShowBalance extends AppCompatActivity {

    private TextView viewBalance;
    private EditText editBalance;
    private Button buttonConfirm;
    private Button buttonChange;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        controlLayout();
        controlButton();
    }

    private void controlLayout() {
        viewBalance = findViewById(R.id.textView_balance);
        editBalance = findViewById(R.id.editText_balance);
        buttonChange = findViewById(R.id.bottom_change);
        buttonConfirm = findViewById(R.id.bottom_confirm);
    }

    private void controlButton() {
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editBalance.setVisibility(View.VISIBLE);
                buttonConfirm.setVisibility(View.VISIBLE);
            }
        });

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBalance.setText(editBalance.getText().toString());
                editBalance.setVisibility(View.INVISIBLE);
                buttonConfirm.setVisibility(View.INVISIBLE);
            }
        });
    }
}
