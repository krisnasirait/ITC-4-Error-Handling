package com.project.errorhandlingimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum, secondNum;
    private TextView result;
    private Button addBtn, sumBtn;

    int num1,num2, sum, add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.first_btn);
        secondNum = findViewById(R.id.scnd_btn);
        addBtn = findViewById(R.id.add_btn);
        sumBtn = findViewById(R.id.sum_btn);
        result = findViewById(R.id.result);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(firstNum.getText().toString());
                    num2 = Integer.parseInt(secondNum.getText().toString());
                    sum = num1/num2;
                }
                catch (ArithmeticException ae){
                    Toast.makeText(MainActivity.this, "Cannot Divide With 0",Toast.LENGTH_SHORT).show();
                }
                catch (Exception ae){
                    Toast.makeText(MainActivity.this, "Please Input a Number", Toast.LENGTH_SHORT).show();
                }
                result.setText(String.valueOf(sum));
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(firstNum.getText().toString());
                    num2 = Integer.parseInt(secondNum.getText().toString());
                    add = num1 + num2;
                }
                catch (Exception ea){
                    Toast.makeText(MainActivity.this, "Please Input a Number", Toast.LENGTH_SHORT).show();
                }
                result.setText(String.valueOf(add));
            }
        });
    }
}