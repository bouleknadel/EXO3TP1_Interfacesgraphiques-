package com.example.exo3tp1_interfacesgraphiques;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RadioButton btn1,btn2,btn3,btn4,btn5,btn6;
    private String answerQ1,answerQ2;
    private Button suivant, quitter;
    private TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.a);
        btn2=findViewById(R.id.b);
        btn3=findViewById(R.id.c);
        btn4=findViewById(R.id.d);
        btn5=findViewById(R.id.e);
        btn6=findViewById(R.id.f);
        suivant=findViewById(R.id.button4);
        quitter=findViewById(R.id.button3);
        text1=findViewById(R.id.textView2);
        text2=findViewById(R.id.textView3);

        RadioButton[] buttonsQ1 = {btn1, btn2, btn3, btn4};
        RadioButton[] buttonsQ2 = {btn5, btn6};
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (RadioButton btn : buttonsQ1) {
                    if (btn.isChecked()) {
                        answerQ1 = btn.getText().toString();
                        break;
                    }
                }
                for (RadioButton btn : buttonsQ2) {
                    if (btn.isChecked()) {
                        answerQ2 = btn.getText().toString();
                        break;
                    }
                }
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("answer1",answerQ1);
                intent.putExtra("answer2",answerQ2);
                intent.putExtra("qst1",text1.getText().toString());
                intent.putExtra("qst2",text2.getText().toString());
                startActivity(intent);

            }
        });

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}