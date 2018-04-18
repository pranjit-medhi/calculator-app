package com.example.ironclad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button multiply;
    private Button zero;
    private Button divide;
    private Button clear;
    private Button substract;
    private Button equal;
    private Button add;
    private TextView var1;

    private TextView result;

    private final char ADDITION = '+';
    private final char SUBSTRACTION= '-';
    private final char MULTIPLY = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;
    private  char ACTION;

    private  double val1 = Double.NaN;
    private double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUPviews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1.setText(var1.getText().toString()+"9");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + '+');
                var1.setText(null);
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
          compute();
          ACTION = SUBSTRACTION;
           result.setText(String.valueOf(val1) + '-');
           var1.setText(null);
                    }
                });
        multiply.setOnClickListener(new View.OnClickListener() {
         @Override
          public void onClick(View view) {
           compute();
           ACTION = MULTIPLY;
         result.setText(String.valueOf(val1) + '*');
          var1.setText(null);
                    }
                });
           divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            compute();
              ACTION = DIVISION;
               result.setText(String.valueOf(val1) + '/');
                var1.setText(null);
                            }
                        });
           equal.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                compute();
                ACTION= EQUAL;
                result.setText(result.getText().toString() +  String.valueOf(val2)  + '=' + String.valueOf(val1));
               }
           });

           clear.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(var1.getText().length() > 0){
                       CharSequence name = var1.getText().toString();
                       var1.setText(name.subSequence(0, name.length()-1));
                       
                   }
                   else{
                       val1 = Double.NaN;
                       val2 = Double.NaN;
                       var1.setText(null);
                       result.setText(null);                   }

               }
           });
    }
    private void setUPviews()
    {
        one = (Button)findViewById(R.id.button9);
        two = (Button)findViewById(R.id.button8);
        three = (Button)findViewById(R.id.button7);
        four = (Button)findViewById(R.id.button6);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button4);
        seven = (Button)findViewById(R.id.button3);
        eight = (Button)findViewById(R.id.button2);
        nine = (Button)findViewById(R.id.button);
        zero = (Button)findViewById(R.id.button11);
        equal = (Button)findViewById(R.id.button12);
        multiply = (Button)findViewById(R.id.button14);
        divide = (Button)findViewById(R.id.button13);
        clear = (Button)findViewById(R.id.button10);
         add = (Button)findViewById(R.id.button16);
        substract= (Button)findViewById(R.id.button15);
        var1 = (TextView)findViewById(R.id.textView);
        result= (TextView)findViewById(R.id.result);








    }
    private  void compute(){
        if(!Double.isNaN(val1)){
            val2 =Double.parseDouble(var1.getText().toString());

            switch (ACTION){
                case ADDITION:
                    val1 = val1+val2;
                     break;
                case SUBSTRACTION:
                    val1 = val1-val2;
                    break;
                case MULTIPLY:
                    val1 = val1*val2;
                    break;
                case DIVISION:
                    val1 = val1/val2;
                    break;
                case EQUAL:
                    break;

            }

        }
        else{
            val1 = Double.parseDouble(var1.getText().toString());
        }
    }
}
