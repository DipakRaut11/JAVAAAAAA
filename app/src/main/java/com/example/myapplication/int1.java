package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class int1 extends AppCompatActivity {
    EditText num1, num2, ope;
    TextView result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int1);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ope = findViewById(R.id.operation);
        result = findViewById(R.id.result);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ope.equals("+")){

                }
            }
        });




    }
}