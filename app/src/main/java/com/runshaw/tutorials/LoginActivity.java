package com.runshaw.tutorials;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

/**
 * Created by Sharath on 2020/08/13
 **/
public class LoginActivity extends AppCompatActivity {

    TextInputEditText etUserID;
    TextInputEditText etPassword;

    SharedPref sharedPref;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_constraint);

        etUserID = findViewById(R.id.etUserID);
        etPassword = findViewById(R.id.etPassword);

        sharedPref = new SharedPref(this);
    }

    public void goToRegister(View view) {
        startActivity(new Intent(this, RegistrationActivity.class));
    }

    public void submit(View view) {

        String userID = etUserID.getText().toString();
        String password = etPassword.getText().toString();

        if (userID.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Enter userID and Password", Toast.LENGTH_LONG).show();
        }else {
            String sharedPrefUserID = sharedPref.getUserID();
            String sharedPrefUserPassword = sharedPref.getUserPassword();
            String sharedPrefUserName = sharedPref.getUserName();

            if (userID.equals(sharedPrefUserID) && password.equals(sharedPrefUserPassword)){
                Toast.makeText(this, "Login Successful!! Welcome " +sharedPrefUserName, Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Incorrect UserID or Password ", Toast.LENGTH_LONG).show();
            }
        }
    }
}
