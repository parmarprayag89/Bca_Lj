package com.example.bca_lj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        email =findViewById(R.id.main_email);
        password = findViewById(R.id.main_password);

        login = findViewById(R.id.main_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this,"Login Sucessfully",Toast.LENGTH_LONG).show();
                Snackbar.make(view,"Login",Snackbar.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,SingupActivity.class);
                startActivity(intent);
            }
        });



    }
}