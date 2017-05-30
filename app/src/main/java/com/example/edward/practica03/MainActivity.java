package com.example.edward.practica03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Param1, Param2, Param3;
    Button btnIntent, Metodo1,Metodo2,Metodo3;
    TextView etiqueta;
    String sumastr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiqueta = (TextView)findViewById(R.id.textView);
        Param1 = (EditText)findViewById(R.id.edtPar1);
        Param2 = (EditText)findViewById(R.id.edtPar2);
        Param3 = (EditText)findViewById(R.id.edtPar3);

        btnIntent = (Button)findViewById(R.id.btnAct);
        Metodo1 = (Button)findViewById(R.id.btnMet1);
        Metodo2 = (Button)findViewById(R.id.btnMet2);
        Metodo3 = (Button)findViewById(R.id.btnMet3);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,num3;
                float numf1,numf2,numf3;
                switch (v.getId()){
                    case R.id.btnAct:
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT,"Este es mi texto a enviar");
                        intent.setType("text/plain");
                        startActivity(intent);
                        break;
                    case R.id.btnMet1:
                        numf1 = (float)Float.valueOf(Param1.getText().toString());
                        numf2 = (float)Float.valueOf(Param2.getText().toString());
                        sumastr = Metodos.suma(numf1,numf2);
                        etiqueta.setText(sumastr);
                        break;
                    case R.id.btnMet2:
                        numf1 = (float)Float.valueOf(Param1.getText().toString());
                        numf2 = (float)Float.valueOf(Param2.getText().toString());
                        numf3 = (float)Float.valueOf(Param3.getText().toString());
                        sumastr = Metodos.suma(numf1,numf2,numf3);
                        etiqueta.setText(sumastr);
                        break;
                    case R.id.btnMet3:
                        num1 = (int)Integer.valueOf(Param1.getText().toString());
                        num2 = (int)Integer.valueOf(Param2.getText().toString());
                        num3 = (int)Integer.valueOf(Param3.getText().toString());
                        sumastr = Metodos.suma(num1,num2,num3);
                        etiqueta.setText(sumastr);
                        break;
                }
            }
        };
        btnIntent.setOnClickListener(onClick);
        Metodo1.setOnClickListener(onClick);
        Metodo2.setOnClickListener(onClick);
        Metodo3.setOnClickListener(onClick);

    }
}
