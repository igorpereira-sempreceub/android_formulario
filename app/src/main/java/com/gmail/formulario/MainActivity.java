package com.gmail.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView caixa_nome = findViewById(R.id.nome);
                String nome = String.valueOf(caixa_nome.getText());

                TextView caixa_ddd = findViewById(R.id.ddd);
                String ddd = String.valueOf(caixa_ddd.getText());

                TextView caixa_telefone = findViewById(R.id.telefone);
                String telefone = String.valueOf(caixa_telefone.getText());

                TextView caixa_nascimento = findViewById(R.id.nascimento);
                String nascimento = String.valueOf(caixa_nascimento.getText());

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("ddd", ddd);
                intent.putExtra("telefone", telefone);
                intent.putExtra("nascimento", nascimento);

                startActivity(intent);

            }
        });
    }
}
