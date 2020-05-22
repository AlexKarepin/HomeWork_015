package com.karepin.homework_015;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public TextView editText;
    public LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editText = findViewById(R.id.screenTextView);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.but0:
                editText.setText(getText(R.string._0));
                break;
            case R.id.but1:
                editText.setText(getText(R.string._1));
                break;
            case R.id.but2:
                editText.setText(getText(R.string._2));
                break;
            case R.id.but3:
                editText.setText(getText(R.string._3));
                break;
            case R.id.but4:
                editText.setText(getText(R.string._4));
                break;
            case R.id.but5:
                editText.setText(getText(R.string._5));
                break;
            case R.id.but6:
                editText.setText(getText(R.string._6));
                break;
            case R.id.but7:
                editText.setText(getText(R.string._7));
                break;
            case R.id.but8:
                editText.setText(getText(R.string._8));
                break;
            case R.id.but9:
                editText.setText(getText(R.string._9));
                break;
        }
    }
}

