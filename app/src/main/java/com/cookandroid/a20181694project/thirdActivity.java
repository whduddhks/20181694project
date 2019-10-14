package com.cookandroid.a20181694project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class thirdActivity extends Activity {

    EditText et_show,et_result;

    Button add,sub,mul,div,del;
    Button result;

    String history = "";
    String number1 = "";
    String number2 = "";

    int type;

    int ADD = 0;
    int SUB = 1;
    int MUL = 2;
    int DIV = 3;
    double d1;
    double d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        et_show = findViewById(R.id.et_show);
        et_result = findViewById(R.id.et_result);
        et_result.setText("");
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        del = findViewById(R.id.btn_del);

        result = findViewById(R.id.btn_result);

        add.setOnClickListener(mListener);
        sub.setOnClickListener(mListener);
        mul.setOnClickListener(mListener);
        div.setOnClickListener(mListener);
        result.setOnClickListener(mListener);
        del.setOnClickListener(mListener);

        Button clear = findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                et_show.setText("");
                et_result.setText("");
                d1 = d2 = 0;
                history = number1 = number2 = "";
            }
        });
    }

    Button.OnClickListener mListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            if(et_result.getText().toString() == null)
            {
                Toast.makeText(thirdActivity.this, "수를 입력하세요", Toast.LENGTH_SHORT).show();
            }
            switch (v.getId()){
                case R.id.btn_add :
                    number1 = et_result.getText().toString();
                    history = et_result.getText().toString() + " + ";
                    et_show.setText(history);
                    et_result.setText("");

                    type = ADD;
                    break;

                case R.id.btn_sub :
                    number1 = et_result.getText().toString();
                    history = et_result.getText().toString() + " - ";
                    et_show.setText(history);
                    et_result.setText("");

                    type = SUB;
                    break;

                case R.id.btn_mul :
                    number1 = et_result.getText().toString();
                    history = et_result.getText().toString() + " * ";
                    et_show.setText(history);
                    et_result.setText("");

                    type = MUL;
                    break;

                case R.id.btn_div :
                    number1 = et_result.getText().toString();
                    history = et_result.getText().toString() + " / ";
                    et_show.setText(history);
                    et_result.setText("");

                    type = DIV;
                    break;

                case R.id.btn_del :

                    String del_number = et_result.getText().toString();
                    Toast.makeText(thirdActivity.this,del_number,Toast.LENGTH_SHORT).show();
                    et_result.setText(del_number.substring(0,del_number.length() - 1));
                    break;

                case R.id.btn_result :
                    double result = 0;
                    Toast.makeText(thirdActivity.this, "결과", Toast.LENGTH_SHORT).show();
                    number2 = et_result.getText().toString();
                    history = history + et_result.getText().toString();
                    et_show.setText(history);

                    d1 = Double.parseDouble(number1);
                    d2 = Double.parseDouble(number2);

                    if(type == ADD){
                        result = d1 + d2;
                        et_result.setText(""+ result);
                    } else if (type == SUB){
                        result = d1 - d2;
                        et_result.setText(""+result);
                    } else if (type == MUL) {
                        result = d1 * d2;
                        et_result.setText("" + result);
                    } else if (type == DIV) {
                        result = d1 / d2;
                        et_result.setText("" + result);
                    }

                    number1 = et_result.getText().toString();
                    break;
            }
        }
    };

    public  void onClick (View v)
    {
        switch(v.getId()){
            case R.id.btn0 : et_result.setText(et_result.getText().toString() + 0); break;
            case R.id.btn1 : et_result.setText(et_result.getText().toString() + 1); break;
            case R.id.btn2 : et_result.setText(et_result.getText().toString() + 2); break;
            case R.id.btn3 : et_result.setText(et_result.getText().toString() + 3); break;
            case R.id.btn4 : et_result.setText(et_result.getText().toString() + 4); break;
            case R.id.btn5 : et_result.setText(et_result.getText().toString() + 5); break;
            case R.id.btn6 : et_result.setText(et_result.getText().toString() + 6); break;
            case R.id.btn7 : et_result.setText(et_result.getText().toString() + 7); break;
            case R.id.btn8 : et_result.setText(et_result.getText().toString() + 8); break;
            case R.id.btn9 : et_result.setText(et_result.getText().toString() + 9); break;
        }
    }
}


