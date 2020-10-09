package com.example.app_juan_navea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText titular,apell,numtar,dd,mm,cod,direcedit,ciudad,estado,codpos;
    String n = titular.getText().toString();
    String a = apell.getText().toString();
    String t= numtar.getText().toString();
    String mes = dd.getText().toString();
    String anio = mm.getText().toString();
    String codig = cod.getText().toString();
    String d = direcedit.getText().toString();
    String c = ciudad.getText().toString();
    String e = estado.getText().toString();
    String codp = codpos.getText().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titular = (EditText)findViewById(R.id.titular);
        apell = (EditText)findViewById(R.id.apell);
        numtar = (EditText)findViewById(R.id.num_tar);
        dd = (EditText)findViewById(R.id.mes);
        mm = (EditText)findViewById(R.id.anio);
        cod = (EditText)findViewById(R.id.cod);
        direcedit = (EditText)findViewById(R.id.derecedit);
        ciudad = (EditText)findViewById(R.id.ciudad);
        estado = (EditText)findViewById(R.id.estado);
        codpos = (EditText)findViewById(R.id.codpos);
    }

    public void guardar(View v){
        if (validar() == true){
        Intent guardar = new Intent(this, segundaActivity.class);
        guardar.putExtra("dato", n);
        guardar.putExtra("dato1", a);
        guardar.putExtra("dato2", t);
        guardar.putExtra("dato3", mes);
        guardar.putExtra("dato4", anio);
        guardar.putExtra("dato5", codig);
        guardar.putExtra("dato6", d);
        guardar.putExtra("dato7", c);
        guardar.putExtra("dato8", e);
        guardar.putExtra("dato9", codp);
        startActivity(guardar);
        }
    }

    public boolean validar(){
        boolean retorno = true;
        String n = titular.getText().toString();
        String a = apell.getText().toString();
        String t= numtar.getText().toString();
        String mes = dd.getText().toString();
        String anio = mm.getText().toString();
        String codig = cod.getText().toString();
        String d = direcedit.getText().toString();
        String c = ciudad.getText().toString();
        String e = estado.getText().toString();
        String codp = codpos.getText().toString();
        if (n.isEmpty()){
            titular.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (a.isEmpty()){
            apell.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (t.isEmpty()){
            numtar.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (mes.isEmpty()){
            dd.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (anio.isEmpty()){
            mm.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (codig.isEmpty()){
            cod.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (d.isEmpty()){
            direcedit.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (c.isEmpty()){
            ciudad.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (e.isEmpty()){
            estado.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (codp.isEmpty()){
            codpos.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        return retorno;

    }
}