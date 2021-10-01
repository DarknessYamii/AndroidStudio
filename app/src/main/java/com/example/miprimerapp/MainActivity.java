package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  EditText et1;
    private EditText et2;

    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Atributos conectados a cada campo de la parte grafica

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);




    /*    int matematicas = 5;
        int quimica = 5;
        int fisica = 5;
        int resultado = 0;
        resultado = (matematicas + quimica + fisica) / 3;
        if (resultado >= 5) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_LONG).show();

        } else if (resultado <= 4) {
            Toast.makeText(this, "Suspenso", Toast.LENGTH_LONG).show();
        }*/
        // Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad está creada.



    }
    public void sumar(View view){

        String valor1 =  et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resultado = num1 + num2;

        String resultNum = String.valueOf(resultado);

        tv1.setText(resultNum);


    }

/*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
*/
}


