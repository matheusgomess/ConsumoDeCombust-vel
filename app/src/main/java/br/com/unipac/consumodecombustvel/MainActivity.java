package br.com.unipac.consumodecombustvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText distanciaEdt;
    EditText litrosEdt;
    Button calcularMediaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanciaEdt = (EditText) findViewById(R.id.distanciaEdt);
        litrosEdt = (EditText) findViewById(R.id.litrosEdt);
        calcularMediaBtn = (Button) findViewById(R.id.calcularMediaBtn);

        calcularMediaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double distancia = Double.parseDouble(distanciaEdt.getText().toString());
                double litros = Double.parseDouble(litrosEdt.getText().toString());

                double media = getMedia(distancia, litros);

                String resultado = "O cálculo da média de consumo de combustível é " + media + " u.d/litros";
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_LONG).show();
            }
        });
    }

    private double getMedia(double distancia, double litros) {
        return distancia / litros;
    }
}