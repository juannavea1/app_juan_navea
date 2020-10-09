package com.example.app_juan_navea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class segundaActivity extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        extrasdatos();
    }
    public void extrasdatos(){
        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("dato");
        String ap = extras.getString("dato1");
        String num = extras.getString("dato2");
        String Mm = extras.getString("dato3");
        String Yy = extras.getString("dato4");
        String cvv = extras.getString("dato5");
        String direc = extras.getString("dato6");
        String ciudad = extras.getString("dato7");
        String estado = extras.getString("dato8");
        String codigop = extras.getString("dato9");

        text2 = (TextView)findViewById(R.id.text1);
        text2.setText(nom);
        text3 = (TextView)findViewById(R.id.text2);
        text3.setText(ap);
        text4 = (TextView)findViewById(R.id.text3);
        text4.setText(num);
        text5 = (TextView)findViewById(R.id.text4);
        text5.setText(Mm);
        text6 = (TextView)findViewById(R.id.text5);
        text6.setText(Yy);
        text7 = (TextView)findViewById(R.id.text6);
        text7.setText(cvv);
        text8 = (TextView)findViewById(R.id.text7);
        text8.setText(direc);
        text9 = (TextView)findViewById(R.id.text8);
        text9.setText(ciudad);
        text10 = (TextView)findViewById(R.id.text9);
        text10.setText(estado);
        text1 = (TextView)findViewById(R.id.text10);
        text1.setText(codigop);

    }
}