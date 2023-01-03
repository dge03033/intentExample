package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button btn_move;
    private EditText ed_text;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_text = findViewById(R.id.ed_text);


        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = ed_text.getText().toString();
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("str",str);
                startActivity(intent); // 액티비티이동

            }
        });

    }
}