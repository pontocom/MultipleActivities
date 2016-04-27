package pt.iscte.pamdaam.multipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /**
     * Função para definir o que faz o botão de Close
     */
    public void closeButtonClick(View v) {
        // termina a actividade actual
        finish();
    }
}
