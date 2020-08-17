package com.runshaw.tutorials.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.runshaw.tutorials.R;
import com.runshaw.tutorials.data.SharedPref;

/**
 * Created by Sharath on 2020/08/13
 **/
public class RegistrationActivity extends AppCompatActivity {

    EditText etUserName;
    EditText etUserID;
    EditText etPassword;

    SharedPref sharedPref;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUserName = findViewById(R.id.etUserName);
        etUserID = findViewById(R.id.etUserID);
        etPassword = findViewById(R.id.etPassword);

        sharedPref = new SharedPref(this);
    }

    public void submit(View view) {
        String userName = etUserName.getText().toString();
        String userID = etUserID.getText().toString();
        String userPassword = etPassword.getText().toString();

        if (userID.isEmpty() || userPassword.isEmpty()){
            Toast.makeText(this, "Both fields are mandatory!!", Toast.LENGTH_LONG).show();
        }else{
            sharedPref.setUserName(userName);
            sharedPref.setUserID(userID);
            sharedPref.setUserPassword(userPassword);
            Toast.makeText(this, "Registration Successful!!", Toast.LENGTH_LONG).show();
        }
    }
}
