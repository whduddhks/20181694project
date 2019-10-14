package com.cookandroid.a20181694project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List idlist = new ArrayList();
    public static List passwordlist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstEditText = (EditText) findViewById(R.id.firstEditText);
        final EditText secondEditText = (EditText) findViewById(R.id.secondEditText);

        idlist.add("jyy1551");
        passwordlist.add("whduddhks");

        Button signup = (Button) findViewById(R.id.singup);
        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),
                        SecondActivity.class);
                startActivity(intent);
            }
        });

        Button signin = (Button) findViewById(R.id.singin);
        signin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                for(int i=0; i<idlist.size(); i++){
                    if(firstEditText.getText().toString().equals(idlist.get(i))) {
                        if (secondEditText.getText().toString().equals(passwordlist.get(i))) {
                            Intent intent = new Intent(getApplicationContext(),
                                    thirdActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity.this, "Password가 틀립니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                Toast.makeText(MainActivity.this, "ID가 틀립니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
