package com.example.urbanpizzalab.ui.view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.urbanpizzalab.R;
import com.example.urbanpizzalab.data.controller.DistritoController;
import com.example.urbanpizzalab.data.controller.UsuarioController;
import com.example.urbanpizzalab.data.model.Distrito;
import com.example.urbanpizzalab.data.model.Usuario;

import java.util.ArrayList;

public class Register extends AppCompatActivity {
    DistritoController distritoController;
    UsuarioController usuarioController;
    ArrayList<Distrito> listaDistritos;

    EditText nomR, apeR, dnoR, emailR, passR;
    Spinner discR;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nomR = findViewById(R.id.txt_nombres_register);
        apeR = findViewById(R.id.txt_apellidos_register);
        dnoR = findViewById(R.id.txt_dni);
        emailR = findViewById(R.id.txt_email_register);
        passR = findViewById(R.id.txt_contraseña_register);
        discR = findViewById(R.id.sp_distrito);

        btnRegistrar = findViewById(R.id.btn_register);

        distritoController = new DistritoController(this);
        usuarioController = new UsuarioController(this);

        // Llenar el Spinner
        cargarDistritos();

        // Lógica de registro
        btnRegistrar.setOnClickListener(v -> {
            String nombre = nomR.getText().toString().trim();
            String apellido = apeR.getText().toString().trim();
            String dniStr = dnoR.getText().toString().trim();
            String email = emailR.getText().toString().trim();
            String password = passR.getText().toString().trim();

            // Validación básica
            if (nombre.isEmpty() || apellido.isEmpty() || dniStr.isEmpty() ||
                    email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                return;
            }

            int dni;
            try {
                dni = Integer.parseInt(dniStr);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "DNI inválido", Toast.LENGTH_SHORT).show();
                return;
            }

            // Obtener ID de distrito desde la posición del spinner
            int posSeleccionada = discR.getSelectedItemPosition();
            int idDistrito = listaDistritos.get(posSeleccionada).getID_Distrito();

            // Crear objeto usuario (el ID es 0 ya que es autogenerado)
            Usuario nuevoUsuario = new Usuario(0, nombre, apellido, email, password, idDistrito, dni);

            // Insertar en BD
            boolean success = usuarioController.insertarUsuario(nuevoUsuario);
            if (success) {
                Toast.makeText(this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();
                limpiarCampos();
            } else {
                Toast.makeText(this, "Error al registrar", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // Cargar distritos en Spinner
    private void cargarDistritos() {
        listaDistritos = distritoController.listarDistritos();
        ArrayList<String> nombresDistritos = new ArrayList<>();

        for (Distrito d : listaDistritos) {
            nombresDistritos.add(d.getNombre());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nombresDistritos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        discR.setAdapter(adapter);
    }

    // Limpiar campos luego de registrar
    private void limpiarCampos() {
        nomR.setText("");
        apeR.setText("");
        dnoR.setText("");
        emailR.setText("");
        passR.setText("");
        discR.setSelection(0);
    }
}