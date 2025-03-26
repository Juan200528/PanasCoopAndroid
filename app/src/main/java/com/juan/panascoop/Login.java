package com.juan.panascoop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText editTextCorreo, editTextContraseña;
    private Button buttonIniciarSesion;
    private TextView textViewRegistrarse, textViewOlvidoContraseña;
    private ImageView imageViewFacebook, imageViewGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextContraseña = findViewById(R.id.editTextContraseña);
        buttonIniciarSesion = findViewById(R.id.buttonIniciarSesion);
        textViewRegistrarse = findViewById(R.id.textViewRegistrarse);
        textViewOlvidoContraseña = findViewById(R.id.textViewOlvidoContraseña);
        imageViewFacebook = findViewById(R.id.imageViewFacebook);
        imageViewGoogle = findViewById(R.id.imageViewGoogle);

        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí va la lógica de inicio de sesión
                String correo = editTextCorreo.getText().toString();
                String contraseña = editTextContraseña.getText().toString();

                if (correo.isEmpty() || contraseña.isEmpty()) {
                    Toast.makeText(Login.this, "Por favor, ingresa correo y contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes agregar la lógica para validar las credenciales
                    // y navegar a la siguiente actividad si el inicio de sesión es exitoso
                    Toast.makeText(Login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textViewRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la actividad de registro
                Intent intent = new Intent();
                startActivity(intent);
            }
        });

        textViewOlvidoContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la actividad de recuperación de contraseña
                Intent intent = new Intent();
                startActivity(intent);
            }
        });

        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para iniciar sesión con Facebook
            }
        });

        imageViewGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para iniciar sesión con Google
            }
        });
    }
}