package com.example.week_2_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        t1 = findViewById(R.id.textView3);
        t2 = findViewById(R.id.textView4);
        t3 = findViewById(R.id.textView5);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String v1 = t1.getText().toString();
                String v2 = t2.getText().toString();

                if (v1.equals(v2)) {
                    t3.setText("THANK YOU");
                } else {
                    t3.setText("PASSWORDS MUST MATCH");
                }
            }
        });
    }
}