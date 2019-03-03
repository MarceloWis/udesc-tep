package com.example.exercicio01;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText txtNome,txtEmail,txtEmail2;
    private Button btnSend, btnClean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createActionBar();
       
        txtNome =    (EditText) findViewById(R.id.edtTxtNome);
        txtEmail =   (EditText) findViewById(R.id.edtTxtEmail);
        txtEmail2 =  (EditText) findViewById(R.id.edtTxtEmail2);
        btnSend =    (Button)   findViewById(R.id.btnSend);
        btnClean =   (Button)   findViewById(R.id.btnClean);

        createEvent();

    }

    public void createEvent(){
        btnClean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                txtNome.setText("");
                txtEmail.setText("");
                txtEmail2.setText("");
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                //Bundle
                Bundle params = new Bundle();
                params.putString("nome",  txtNome.getText().toString());
                params.putString("email", txtEmail.getText().toString());
                params.putString("email2",txtEmail2.getText().toString());

                intent.putExtras(params);

                startActivity(intent);
            }
        });

    }
  
  
   

    private void createActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cadastro");
        // actionBar.setSubtitle("Meu subtítulo");
    }

    

}
