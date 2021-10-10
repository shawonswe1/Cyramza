package com.hpl.cyramza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email,pass;
    Button login;
    PreConfig preConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        preConfig = new PreConfig(this);
        email = findViewById(R.id.et_Email);
        pass = findViewById(R.id.et_Password);
        login = findViewById(R.id.btn_Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString();
                String Pass = pass.getText().toString();
                Login(Email,Pass);
            }
        });
    }

    private void Login(String email, String pass)
    {
        if (email.equals("admin@mail.com")&&pass.equals("admin"))
        {
            startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            preConfig.writeUserName(email);
            finish();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Your Email or Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}