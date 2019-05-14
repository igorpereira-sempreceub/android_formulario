package com.gmail.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String ddd = intent.getStringExtra("ddd");
        String telefone = intent.getStringExtra("telefone");
        String nascimento = intent.getStringExtra("nascimento");

        TextView caixa_nome = findViewById(R.id.nome_res);
        TextView caixa_ddd = findViewById(R.id.ddd_res);
        TextView caixa_telefone = findViewById(R.id.telefone_res);
        TextView caixa_nascimento = findViewById(R.id.nascimento_res);


        caixa_nome.setText(nome);
        caixa_ddd.setText(ddd);
        caixa_telefone.setText(telefone);
        caixa_nascimento.setText(nascimento);

    }

}
