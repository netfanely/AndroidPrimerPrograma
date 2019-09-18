package com.netfanely.erlifegov02;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu2Activity extends AppCompatActivity implements View.OnClickListener {
Button btnSalir, btnCadastrar, btnSensor, btnInformate, btnAlerta;
TextView nombre;
int id=0;
Usuario u;
daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        nombre=(TextView)findViewById(R.id.nombreUsuario);
        btnSalir=(Button) findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(this);
        btnCadastrar=(Button) findViewById(R.id.btnCadastrar);
        btnInformate=(Button)findViewById(R.id.btnInformate);
        btnSensor=(Button)findViewById(R.id.btnSensor);
        btnAlerta=(Button)findViewById(R.id.btnAlerta);
        btnCadastrar.setOnClickListener(this);
        btnInformate.setOnClickListener(this);
        btnSensor.setOnClickListener(this);
        btnAlerta.setOnClickListener(this);

        Bundle b=getIntent().getExtras();
        id=b.getInt("id");
        dao = new daoUsuario(this);
        u=dao.getUsuariobyId(id);
        nombre.setText(u.getNombre()+" "+u.getApellidos());
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.btnSalir :

            Intent i2=new Intent(Menu2Activity.this,MainActivity.class);
            startActivity(i2);
            finish();
            break;
        case R.id.btnCadastrar :
            Intent i3=new Intent(Menu2Activity.this,Cadastra1Activity.class);
            startActivity(i3);
            finish();
            break;
        case R.id.btnInformate :
            Intent i4=new Intent(Menu2Activity.this,Informa1ctivity.class);
            startActivity(i4);
            finish();
            break;
        case R.id.btnSensor :
            Intent i5=new Intent(Menu2Activity.this,Sensor1Activity.class);
            startActivity(i5);
            finish();
            break;
        case R.id.btnAlerta :
            Intent i6=new Intent(Menu2Activity.this,Alerta1Activity.class);
            startActivity(i6);
            finish();
            break;
    }
    }
}
