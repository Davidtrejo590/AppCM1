package com.tallermovil.app_cm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView tv_saludo;
    Button btn_saludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_saludo = findViewById(R.id.tv_saludo);
        btn_saludar = findViewById(R.id.btn_saludar);

        tv_saludo.setOnClickListener(this);
        btn_saludar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_saludar:
                tv_saludo.setText("Hello World!");
                break;
            case R.id.tv_saludo:
                tv_saludo.setText("Hello David!");
                break;
            default:
                break;
        }
    }
}