package com.example.myfirstappanalisis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    //DeclareVariables
    private EditText editTex1;
    private EditText editTex2;
    private TextView textViewResult;





    //Method OnCreate is executed whe the screen is created (MAIN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazarlo
        editTex1 = findViewById(R.id.editTextNumber1);
        editTex2 = findViewById(R.id.editTextNumber2);

        textViewResult = findViewById(R.id.textResultado);
    }

    public void sumar(View view){
        int resultado = Integer.parseInt(editTex1.getText().toString()) +
                Integer.parseInt(editTex2.getText().toString());
        textViewResult.setText(resultado +"");

    }

    public void restar(View view){
        int resultado = Integer.parseInt(editTex1.getText().toString()) -
                Integer.parseInt(editTex2.getText().toString());
        textViewResult.setText(resultado +"");

    }

    public void multiplicar(View view){
        int resultado = Integer.parseInt(editTex1.getText().toString()) *
                Integer.parseInt(editTex2.getText().toString());
        textViewResult.setText(resultado +"");

    }

    public void dividir(View view){

        try {
            int resultado = Integer.parseInt(editTex1.getText().toString()) /
                    Integer.parseInt(editTex2.getText().toString());
            textViewResult.setText(resultado +"");

        }

        catch (Exception e) {
            textViewResult.setText("Division entre cero");
        }


    }






}