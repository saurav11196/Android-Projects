package com.example.coolblues.smartcity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void onSignUpClick(View v) {
        if(v.getId() == R.id.registerButton) {
            EditText username = (EditText) findViewById(R.id.usernameRegister);
            EditText email = (EditText) findViewById(R.id.emailRegister);
            EditText phone = (EditText) findViewById(R.id.phoneRegister);
            EditText password = (EditText) findViewById(R.id.passwordRegister);
            EditText cPassword = (EditText) findViewById(R.id.passwordConfirmRegister);

            String usernameStr = username.getText().toString();
            String emailStr = email.getText().toString();
            String phoneStr = phone.getText().toString();
            String passwordStr = password.getText().toString();
            String cPasswordStr = cPassword.getText().toString();

            if(!passwordStr.equals(cPasswordStr)) {
                Toast pass = Toast.makeText(RegisterActivity.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if(!phoneStr.isEmpty()){
                //this will pop up a message
                Toast phone1 = Toast.makeText(RegisterActivity.this, "Enter phone number!", Toast.LENGTH_SHORT);
                phone1.show();
            }
            else {
                Contact c = new Contact();
                c.setUsername(usernameStr);
                c.setEmail(emailStr);
                c.setPhone(phoneStr);
                c.setPassword(passwordStr);
                helper.insertContact();

                Intent myIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(myIntent);
                Toast info = Toast.makeText(RegisterActivity.this, "You've registered successfully!", Toast.LENGTH_SHORT);
                info.show();
            }
        }
    }
}
