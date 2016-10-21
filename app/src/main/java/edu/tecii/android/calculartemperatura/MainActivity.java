package edu.tecii.android.calculartemperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtCentigrados;
    private TextView txtFarenheit, txtkelvin, txtRanking;
    private Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalcular=(Button)findViewById(R.id.btn1);
        edtCentigrados=(EditText)findViewById(R.id.edt1);
        txtFarenheit=(TextView)findViewById(R.id.txt2);
        txtkelvin=(TextView)findViewById(R.id.txt3);
        txtRanking=(TextView)findViewById(R.id.txt4);
    }

    public void calculartemperatura(View view){
        Double gradc = Double.parseDouble(edtCentigrados.getText().toString());
        Double gradf =  32 + (9 * gradc/5);
        Double gradk = gradc + 273.15;
        Double gradr = gradc * 1.8;


        String resu = "";
        String resu1 ="";
        String resu2 = "";

        resu = "El resultado en Grados Farenheit es: " + gradf;
        resu1 = "El resultado en Grados Kelvin es: " + gradk;
        resu2 = "El resultado en Grados Ranking es: " + gradr;

        txtFarenheit.setText(resu);
        txtkelvin.setText(resu1);
        txtRanking.setText(resu2);
    }
}
