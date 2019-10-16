package com.example.toshiba.calculator;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private Button Button;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private TextView textView2;
    private TextView textView3;
    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '0';
    private double val1 = double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();
        Button.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'9');
            }
        };
        button.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'8');
            }
        };
        button2.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'7');
            }
        };
        button3.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'6');
            }
        };
        button4.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'5');
            }
        };
        button5.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'4');
            }
        };
        button6.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'3');
            }
        };
        button7.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'2');
            }
        };
        button8.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'1');
            }
        };
        button9.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'*');
            }
        };
        button10.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'0');
            }
        };
        button11.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+'.');
            }
        };
        button12.setOnClickListener(new View.OnClickListener){
            public void onClick(View v){
                textView2.setText(textView2.getText().toString()+' ');
            }
        };
        button14.setOnClickListener(new View.OnClickListener(v)){
            public void onClick(View v){
                compute();
                ACTION = ADDITION;
                textView3.setText(String.valueOf(val1)+ "+");
                textView2.setText(null);
            }
        };
        button15.setOnClickListener(new View.OnClickListener(v)){
            public void onClick(View v){
                compute();
                ACTION = SUBSTRACTION;
                textView3.setText(String.valueOf(val1)+"-");
                textView2.setText(null);
            }
        };
        button9.setOnClickListener(new View.OnClickListener(v)){
            public void onClick(View v){
                compute();
                ACTION = MULTIPLICATION;
                textView3.setText(String.valueOf(val1)+"*");
                textView2.setText(null);
            }
        };
        button16.setOnClickListener(new View.OnClickListener(v)){
            public void onClick(View v){
                compute();
                ACTION = DIVISION;
                textView3.setText(String.valueOf(val1)+"/");
                textView2.setText(null);
            }
        };
        button13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            compute();
            ACTION = EQU;
            textView3.setText(textView3.getText().toString() + String.valueof(val2) + "=" + String.valueof(val1));
            textView2.setText(null);
        });
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            if(textView2.getText().length>0){
                CharSequence name = info.getText().toString()
                        textView2.setText(name.subSequence(0, name.length()-1));
            }
            else {
                val1 = Double.NaN;
                val2 = Double.NaN;
                textView2.setText(null);
                textView3.setText(null);
            }
                    });

    }
    private void setupUIView(){
        Button = (Button)findViewById(R.id.Button);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button8);
        button10 = (Button)findViewById(R.id.button9);
        button11 = (Button)findViewById(R.id.button10);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
    }
    private void compute(){
        if (!Double.isNaN(val1)){
            val2 =Double.parseDouble(textView2.getText().toString());
            switch (ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBSTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 + val2;
                    break;
                case EQU:
                    break;
            }
        }
        else {
            val2 = Double.parseDouble(textView2.getText().toString());
        }
    }

}
