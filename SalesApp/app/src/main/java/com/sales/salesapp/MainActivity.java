package com.sales.salesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button btnContinue = findViewById(R.id.btn_login);
        EditText field_user = findViewById(R.id.field_user);
        EditText field_pass = findViewById(R.id.field_pass);
        TextView btnForgotPass = findViewById(R.id.btn_forgot_pass);

        //Boton Olvido de Contraseña
        btnForgotPass.setOnClickListener(e ->
                Toast.makeText(MainActivity.this,"Soy el boton Forgot Pass", Toast.LENGTH_LONG).show());

        //Boton iniciar Login
        btnContinue.setOnClickListener(e -> {});
    }


}