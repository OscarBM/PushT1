package com.example.loc.calculadoratest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = (TextView) findViewById(R.id.pantalla);
        Button button = (Button) findViewById(R.id.boton1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //lo que pasa
                //Log.d( "DEBUG","HOLA");
                pantalla.setText("1");
            }
        });

    }
}
