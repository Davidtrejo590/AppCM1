package com.tallermovil.app_cm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOGTAG = "INFORMATION";

    /* Basic Link Elements */
    TextView tvSaludo;
    Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                                /* Link to activity_main.xml */
        /* Log */
        Log.i(LOGTAG, "Hello World!");

        /* Link */
        tvSaludo = findViewById(R.id.tv_saludo);
        btnSaludar = findViewById(R.id.btn_saludar);

        /* Methods */
        //tvSaludo.setText("Cómputo Móvil");                                    /* Text Whit Hard Code */
        //tvSaludo.setText(getResources().getString(R.string.app_name));        /* Text Whitout Hard Code*/

        /* Actions for Buttons */
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Hello David!");
            }
        });

        tvSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Hello World");                                /* Whit Hard Code */
            }
        });

    }
}