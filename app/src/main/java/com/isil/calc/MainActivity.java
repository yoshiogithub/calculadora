package com.isil.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // declaracion de variables

    EditText caja1;
    EditText caja2;
    String anuncio="CALCULADORA VIRTUAL",txt1,txt2;
    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //extraccion de datos por medio de ID

        caja1 = findViewById(R.id.editText);
        caja2 = findViewById(R.id.editText2);

        Toast.makeText(this,anuncio, Toast.LENGTH_SHORT).show();
    }
        //crear funciones

        int suma(int a,int b){
            int s = a + b;
            return s;
        }
        int resta(int a,int b) {
            int r = a - b;
            return r;
        }
        int multiplica(int a,int b) {
            int m = a * b;
            return m;
        }
        double divide(double a,double b) {
            double d = a / b;
            return d;
        }


    //conversion de los datos a String

    public void sumar(View view){
        if(caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()){
            Toast.makeText(this, "Complete las casillas ", Toast.LENGTH_SHORT).show();
        }else {
            int n1=Integer.parseInt(caja1.getText().toString());
            int n2=Integer.parseInt(caja2.getText().toString());

            int s = suma(n1, n2);
            Toast.makeText(this, "El resultado de la suma es : "+s, Toast.LENGTH_LONG).show();
        }
    }
    public void resta(View view){
        if(caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()){
            Toast.makeText(this, "Complete las casillas ", Toast.LENGTH_SHORT).show();
        }else {
            int n1 = Integer.parseInt(caja1.getText().toString());
            int n2 = Integer.parseInt(caja2.getText().toString());

            int r = resta(n1, n2);

            Toast.makeText(this, "El resultado de la resta es : " + r, Toast.LENGTH_LONG).show();
        }
    }
    public void multiplicacion(View view) {
        if (caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Complete las casillas ", Toast.LENGTH_SHORT).show();
        } else {
            int n1 = Integer.parseInt(caja1.getText().toString());
            int n2 = Integer.parseInt(caja2.getText().toString());

            int m = multiplica(n1, n2);

            Toast.makeText(this, "El resultado de la multiplicación es : " + m, Toast.LENGTH_LONG).show();
        }
    }
    public void division(View view){

        if(caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()){
            Toast.makeText(this, "Complete las casillas ", Toast.LENGTH_SHORT).show();
        }else {
            double n1=Double.parseDouble(caja1.getText().toString());
            double n2=Double.parseDouble(caja2.getText().toString());

        String d = df.format(divide(n1, n2));

        Toast.makeText(this, "El resultado de la división es : "+d, Toast.LENGTH_LONG).show();
        }
    }
}
