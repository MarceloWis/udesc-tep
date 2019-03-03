package com.example.exercicio01;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SegundaActivity extends AppCompatActivity {
    private TextView txtNome, txtEmail, txtEmail2;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        
        createActionBar();
        //Ler parâmetros
        Bundle params = getIntent().getExtras();
        String nome = params.getString("nome");
        String email = params.getString("email");
        String email2 = params.getString("email2");

        //Coloca num label
        txtNome = (TextView) findViewById(R.id.txtNome);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtEmail2 = (TextView) findViewById(R.id.txtEmail2);
        btnVoltar =   (Button)   findViewById(R.id.btnVoltar);

        txtNome.setText(nome);
        txtEmail.setText(email);
        txtEmail2.setText(email2);
        createEvent();
    }

    private void createActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Detalhes do Cadastro");
    }

    public void createEvent(){
        btnVoltar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) { 
                Intent intent = new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
// btnVoltar