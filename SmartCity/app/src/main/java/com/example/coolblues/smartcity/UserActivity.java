package com.example.coolblues.smartcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView) findViewById(R.id.usernameShow);
        tv.setText(username);

    }
}
