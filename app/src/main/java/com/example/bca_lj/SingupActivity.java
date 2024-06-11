package com.example.bca_lj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SingupActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText contact;
    EditText password;
    EditText confirmpassword;

    Button singup ;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_singup);

        name = findViewById(R.id.singup_name);
        email = findViewById(R.id.singup_email);
        contact = findViewById(R.id.singup_contact);
      password = findViewById(R.id.singup_pass);
      confirmpassword = findViewById(R.id.singup_confirmpass);

      singup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (name.getText().toString().trim().equals("")){
                  name.setError("Name required");
              } else if (email.getText().toString().trim().equals("")) {
                  email.setError("Email id required");
              }
              else if (!email.getText().toString().trim().matches(emailPattern)) {
                  email.setError("Email id not valid ");
              } else if (contact.getText().toString().trim().equals("")) {
                  contact.setError("Contact No required ");
              } else if (password.getText().toString().trim().equals("")) {
                  password.setError("Password required");
              }
              else if (confirmpassword.getText().toString().trim().equals("")) {
                  confirmpassword.setError("Password required");
              } else if (confirmpassword.getText().toString().trim().matches(password.getText().toString())) {
                  confirmpassword.setError("Password does not match ");

              }
              else {

              }

          }
      });




    }
}