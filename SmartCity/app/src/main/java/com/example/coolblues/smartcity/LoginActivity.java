package com.example.coolblues.smartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //when button gets click this method will be called
    public void onButtonClick(View v) {
        if(v.getId() == R.id.logInButtonEnter) {
            //will take username and password entered by user
            EditText a = (EditText) findViewById(R.id.usernameEnter);
            String str = a.getText().toString();
            EditText b = (EditText) findViewById(R.id.passwordEnter);
            String pass = a.getText().toString();

            String password = helper.searchPass(str);

            }

            //Intent variable takes two parameter - "1st the activity which you're in" and 2nd "the activity you want to go to"
            Intent myIntent = new Intent(LoginActivity.this, UserActivity.class);

            //passing the value entered in EditText field
            myIntent.putExtra("Username", str);

            //this will start activity which is passed in intent's parameter
            startActivity(myIntent);
        }
        if(v.getId() == R.id.registerButtonEnter) {

            Intent myIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(myIntent);
        }
    }

}