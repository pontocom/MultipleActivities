package pt.iscte.pamdaam.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // definir uma variável para ter o nome da app (apenas para não ter que repetir o texto várias vezes)
    protected static String APP_NAME = "MULTIPLE_ACTIVITIES_APP";

    // definir as variáveis para ler os campos nome e email do formulário
    protected EditText nome, email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obter a ligação aos campos do formulário no layout da Activity
        nome = (EditText) findViewById(R.id.etNome);
        email = (EditText) findViewById(R.id.etEmail);
    }

    /**
     * Função usada para processar o click num determinado botão
     */
    public void clickSecondActivityButton(View v) {
        // mostrar uma mensagem no Log a dizer que carregaram no botão
        Log.i(APP_NAME, "----> CARREGARAM NO BOTÃO!");

        // obter o texto que foi introduzido no campo "nome" do formulário e guardá-lo numa variável
        String s_nome = nome.getText().toString();

        // escrever o nome introduzido para o Log
        Log.i(APP_NAME, "----> NOME = " + s_nome);

        // iniciar uma segunda actividade
        startActivity(new Intent(this, SecondActivity.class));
    }

    /**
     * Função usada para limpar os dados do formulário
     */
    public void clearDataClick(View v) {
        //basicamente o que precisamos de fazer é colocar um texto vazio nos campos do formulário
        nome.setText("");
        email.setText("");
    }
}
