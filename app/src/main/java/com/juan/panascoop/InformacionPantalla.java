package com.juan.panascoop;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class InformacionPantalla extends AppCompatActivity {

    private TextView txtFechaLugar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_pantalla);

        // Inicializar vistas
        txtFechaLugar = findViewById(R.id.txt_fecha_lugar);
        ImageView imgPerfil = findViewById(R.id.img_perfil);
        Button btnPromocionar = findViewById(R.id.btn_promocionar);
        Button btnConfiguracion = findViewById(R.id.btn_configuracion);
        ImageView imgNotificacion = findViewById(R.id.img_notificacion);
        Button btnListaResponsables = findViewById(R.id.btn_lista_responsables);
        Button btnListaParticipantes = findViewById(R.id.btn_lista_participantes);
        Button btnPublicar = findViewById(R.id.btn_publicar);

        // Establecer la fecha y el lugar automáticamente
        setFechaLugar();

        // Listeners para los botones
        imgPerfil.setOnClickListener(view -> abrirPerfil());
        btnPromocionar.setOnClickListener(view -> promocionarActividad());
        btnConfiguracion.setOnClickListener(view -> abrirConfiguracion());
        imgNotificacion.setOnClickListener(view -> mostrarNotificaciones());
        btnListaResponsables.setOnClickListener(view -> abrirListaResponsables());
        btnListaParticipantes.setOnClickListener(view -> abrirListaParticipantes());
        btnPublicar.setOnClickListener(view -> publicarActividad());
    }

    private void setFechaLugar() {
        // Obtener la fecha actual
        String fechaActual = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
        // Lugar predefinido
        String lugar = "Medellín, Colombia";
        // Establecer en el TextView
        txtFechaLugar.setText(fechaActual + " - " + lugar);
    }

    private void abrirPerfil() {
        // Lógica para abrir perfil
    }

    private void promocionarActividad() {
        // Lógica para promocionar actividad
    }

    private void abrirConfiguracion() {
        // Lógica para abrir configuración
    }

    private void mostrarNotificaciones() {
        // Lógica para mostrar notificaciones
    }

    private void abrirListaResponsables() {
        // Lógica para mostrar lista de responsables
    }

    private void abrirListaParticipantes() {
        // Lógica para mostrar lista de participantes
    }

    private void publicarActividad() {
        // Lógica para publicar actividad
    }
}
