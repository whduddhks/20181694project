package com.cookandroid.a20181694project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {

    EditText passwordEditText = (EditText)findViewById(R.id.passwordEditText);
    EditText checkpasswordEditText = (EditText)findViewById(R.id.checkpasswordEditText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(passwordEditText.getText().toString() == checkpasswordEditText.getText().toString()){
                    Intent intent = new Intent(getApplicationContext(),
                            MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다. 확인해주세요", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}

//public class singinmanager{
//    static final string userid = "user,db";
//    static final string password = "password"
//}
