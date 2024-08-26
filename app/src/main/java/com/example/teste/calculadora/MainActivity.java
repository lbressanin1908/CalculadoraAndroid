package com.example.teste.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txtNro1;
    private EditText txtNro2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Procurando pelo ID
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        tvResultado = findViewById(R.id.tvResultado);
    }
    //Aqui eu recebo minha view para poder chamar a função na minha tela
    public  void somar(View view){
        //convertentdo tipo string para int
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public  void subtrair(View view){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 - valor2));
    }
    public  void multiplicar(View view){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 * valor2));
    }
    public  void dividir(View view){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
}