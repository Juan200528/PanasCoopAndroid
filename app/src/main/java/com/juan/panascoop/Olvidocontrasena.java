package com.juan.panascoop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Olvidocontrasena extends AppCompatActivity {

    private EditText emailEditText;
    private Button sendLinkButton, createAccountButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidocontrasena2);

        emailEditText = findViewById(R.id.emailEditText);
        sendLinkButton = findViewById(R.id.sendLinkButton);
        createAccountButton = findViewById(R.id.createAccountButton);

        sendLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                if (email.isEmpty()) {
                    Toast.makeText(Olvidocontrasena.this, "Por favor, introduce tu correo electrónico", Toast.LENGTH_SHORT).show();
                } else {
                    enviarCorreoRecuperacion(email);
                }
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                startActivity(intent);
            }
        });
    }

    private void enviarCorreoRecuperacion(String email) {
        // Aquí iría la lógica para enviar un enlace de recuperación
        Toast.makeText(this, "Se ha enviado un enlace a " + email, Toast.LENGTH_LONG).show();
    }
}
