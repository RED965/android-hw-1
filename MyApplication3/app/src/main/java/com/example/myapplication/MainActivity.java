package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText quiz = findViewById(R.id.editTextTextPersonName);
        EditText homework = findViewById(R.id.editTextTextPersonName2);
        EditText midterm = findViewById(R.id.editTextTextPersonName3);
        EditText finals = findViewById(R.id.editTextTextPersonName4);

        Button calc = findViewById(R.id.button);
        Button clear = findViewById(R.id.button2);

        TextView res = findViewById(R.id.textView2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res1 = Integer.parseInt(quiz.getText().toString());
                int res2 = Integer.parseInt(homework.getText().toString());
                int res3 = Integer.parseInt(midterm.getText().toString());
                int res4 = Integer.parseInt(finals.getText().toString());

                        res.setText(res1 + res2 + res3 + res4 + " ");
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        quiz.setText("");
                        homework.setText("");
                        midterm.setText("");
                        finals.setText("");
                        res.setText("Result");
            }
        });




    }
}