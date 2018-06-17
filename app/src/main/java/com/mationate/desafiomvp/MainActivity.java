package com.mationate.desafiomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ValueCallback {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.valueEt);
        textView = findViewById(R.id.responseTv);

        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = editText.getText().toString();
                new NumberCalculator(MainActivity.this).numberCalculation(number);
            }
        });


    }

    @Override
    public void valuePair() {
        textView.setText("Es un número par");

    }

    @Override
    public void valueImpair(String number) {
        textView.setText("Es un número impar: " + number);
    }


}
