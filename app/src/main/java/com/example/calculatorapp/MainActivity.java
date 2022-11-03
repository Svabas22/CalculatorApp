package com.example.calculatorapp;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button b_equal;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button b_sub;
    private Button b_del;
    private Button b_dot;
    private Button b_mod;
    private Button b_inv;
    private Button b_clear;
    private Button b_plusmin;
    private Button b_root;
    private TextView t1;
    private TextView t2;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private final char EXTRA = '@';
    private final char MODULUS = '%';
    private final char ROOT = '√';
    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;
    private Calculator mCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalculator = new Calculator();
        viewSetup();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exceedLength();
                t1.setText(t1.getText().toString() + ".");
            }
        });

        b_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = MODULUS;
                    operation();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "%");
                    } else {
                        t2.setText((int) val1 + "%");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });
        b_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (t1.getText().length() > 0) {
                    operation();
                    ACTION = ROOT;
                    if (!ifReallyDecimal()) {
                        val1 = Math.sqrt(val1);
                        t2.setText(String.valueOf(val1));
                    } else {
                        val1 = Math.sqrt(val1);
                        t2.setText(String.valueOf(val1));
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });


        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = ADDITION;
                    operation();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "+");
                    } else {
                        t2.setText((int) val1 + "+");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = SUBTRACTION;
                    operation();
                    if (t1.getText().length() > 0)
                        if (!ifReallyDecimal()) {
                            t2.setText(val1 + "-");
                        } else {
                            t2.setText((int) val1 + "-");
                        }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = MULTIPLICATION;
                    operation();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "×");
                    } else {
                        t2.setText((int) val1 + "×");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = DIVISION;
                    operation();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "/");
                    } else {
                        t2.setText(val1 + "/");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_plusmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().isEmpty() || !t1.getText().toString().isEmpty()) {
                    val1 = Double.parseDouble(t1.getText().toString());
                    ACTION = EXTRA;
                    t2.setText("-" + t1.getText().toString());
                    t1.setText("");
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    operation();
                    ACTION = EQU;
                    if (!ifReallyDecimal()) {
                        t2.setText(String.valueOf(val1));
                    } else {
                        t2.setText(String.valueOf((int) val1));
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    CharSequence name = t1.getText().toString();
                    t1.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    t1.setText("");
                    t2.setText("");
                }
            }
        });

        b_del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                t1.setText("");
                t2.setText("");
                return true;
            }
        });
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                t1.setText("");
                t2.setText("");
            }
        });

    }

    public void onOperatorINVClick(View view)
    {

        if (t1.getText().length() > 0) {
            if (!ifReallyDecimal()) {
                val1 = 1/val1;
                t2.setText(String.valueOf(val1));
            } else {
                val1 = 1/val1;
                t2.setText(String.valueOf(val1));
            }
            t1.setText(null);
        } else {
            t2.setText("Error");
        }
    }

    private void viewSetup() {
        b1 = findViewById(R.id.n1);
        b2 = findViewById(R.id.n2);
        b3 = findViewById(R.id.n3);
        b4 = findViewById(R.id.n4);
        b5 = findViewById(R.id.n5);
        b6 = findViewById(R.id.n6);
        b7 = findViewById(R.id.n7);
        b8 = findViewById(R.id.n8);
        b9 = findViewById(R.id.n9);
        b0 = findViewById(R.id.n0);
        b_equal = findViewById(R.id.equals);
        b_multi = findViewById(R.id.multiplication);
        b_divide = findViewById(R.id.division);
        b_add = findViewById(R.id.addition);
        b_sub = findViewById(R.id.subtract);
        b_del = findViewById(R.id.delete);
        b_dot = findViewById(R.id.ndot);
        b_root = findViewById(R.id.root);
        b_mod = findViewById(R.id.procent);
        b_clear = findViewById(R.id.clear);
        b_plusmin = findViewById(R.id.plusmin);
        t1 = findViewById(R.id.calculatedString);
        t2 = findViewById(R.id.calculatorScreen);
    }

    private void operation() {
        if (!Double.isNaN(val1)) {
            if (t2.getText().toString().charAt(0) == '-') {
                val1 = (-1) * val1;
            }
            val2 = Double.parseDouble(t1.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    val1 = mCalculator.addition(val1,val2);
                    break;
                case SUBTRACTION:
                    val1 = mCalculator.subtraction(val1, val2);
                    break;
                case MULTIPLICATION:
                    val1 = mCalculator.multiplication(val1, val2);
                    break;
                case DIVISION:
                    val1 = mCalculator.division(val1, val2);
                    break;
                case EXTRA:
                    val1 = (-1) * val1;
                    break;
                case MODULUS:
                    val1 = mCalculator.modulus(val1, val2);
                    break;
                case EQU:
                    break;
            }
        } else {
            val1 = Double.parseDouble(t1.getText().toString());
        }
    }
    private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }
    private boolean ifReallyDecimal() {
        return val1 == (int) val1;
    }

    private void noOperation() {
        String inputExpression = t2.getText().toString();
        if (!inputExpression.isEmpty() && !inputExpression.equals("Error")) {
            if (inputExpression.contains("-")) {
                inputExpression = inputExpression.replace("-", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("+")) {
                inputExpression = inputExpression.replace("+", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("/")) {
                inputExpression = inputExpression.replace("/", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("%")) {
                inputExpression = inputExpression.replace("%", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("×")) {
                inputExpression = inputExpression.replace("×", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
        }
    }

    private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }
}