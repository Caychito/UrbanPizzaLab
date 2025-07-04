package com.example.urbanpizzalab.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.urbanpizzalab.R;

public class MainActivity extends AppCompatActivity {

    Button log, reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        log = findViewById(R.id.boton_login);
        reg = findViewById(R.id.boton_regis);

        log.setOnClickListener(v -> {
            //Abrir el Login
            Intent login = new Intent(this, Login.class);
            startActivity(login);
        });
        reg.setOnClickListener(v -> {
            //Abrir el Register
            Intent regis = new Intent(this, Register.class);
            startActivity(regis);
        });
    }
}