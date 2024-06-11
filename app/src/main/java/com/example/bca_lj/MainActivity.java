package com.example.bca_lj;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Button login;

    ImageView passwordshow,passwordhide;

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        email =findViewById(R.id.main_email);
        password = findViewById(R.id.main_password);

        login = findViewById(R.id.main_button);

        passwordshow = findViewById(R.id.main_show);

        passwordhide = findViewById(R.id.main_hide);

        passwordshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passwordshow.setVisibility(View.GONE);
                passwordhide.setVisibility(View.VISIBLE);
                password.setTransformationMethod(null);
            }
        });

        passwordhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passwordshow.setVisibility(View.VISIBLE);
                passwordhide.setVisibility(View.GONE);
                password.setTransformationMethod(new PasswordTransformationMethod());
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().trim().equals("")){
                    email.setError("Email Id Required ");
                } else if (!email.getText().toString().trim().matches(emailPattern)) {
                    email.setError("Email id not valid ");

                } else if (password.getText().toString().trim().equals("")) {
                    password.setError("Passsword Required");
                } else if (password.getText().toString().length()<6) {
                    password.setError("Min 6 char req.");
                } else {
                    new CommonMethod(MainActivity.this,"Login Sucessfully");
                    new CommonMethod(view,"Login");

                   new CommonMethod(MainActivity.this,SingupActivity.class);
                }
            }
        });



    }
}