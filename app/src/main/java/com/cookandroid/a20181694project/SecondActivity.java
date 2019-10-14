package com.cookandroid.a20181694project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.cookandroid.a20181694project.MainActivity.idlist;
import static com.cookandroid.a20181694project.MainActivity.passwordlist;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        final EditText idEditText = (EditText)findViewById(R.id.idEditText);
        final EditText passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        final EditText checkpasswordEditText = (EditText)findViewById(R.id.checkpasswordEditText);

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for(int i=0; i<idlist.size(); i++){
                    if(idEditText.getText().toString().equals(idlist.get(i))){
                        Toast.makeText(SecondActivity.this, "이미 존재하는 ID입니다.", Toast.LENGTH_SHORT).show();
                    }
                }
                if(passwordEditText.getText().toString().equals(checkpasswordEditText.getText().toString())){
                    idlist.add(idEditText.getText().toString());
                    passwordlist.add(passwordEditText.getText().toString());
                    Intent intent = new Intent(getApplicationContext(),
                            MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecondActivity.this, "두 개의 비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
