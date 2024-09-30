package com.example.exo3tp1_interfacesgraphiques;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    private TextView text1,text2,text3,text4;
    private Button quitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        text1=findViewById(R.id.textView22);
        text2=findViewById(R.id.textView33);
        text3=findViewById(R.id.textView2);
        text4=findViewById(R.id.textView3);
        quitter=findViewById(R.id.button3);
        text3.setText(this.getIntent().getStringExtra("qst1"));
        text1.setText(this.getIntent().getStringExtra("answer1"));
        text2.setText(this.getIntent().getStringExtra("answer2"));
        text4.setText(this.getIntent().getStringExtra("qst2"));


        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}