package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3;
    EditText textBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        textBuscar = findViewById(R.id.textBuscar);


    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b1){
            Intent intent = new Intent(this, MainActivity.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if(v.getId() == R.id.b2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("112")); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if(v.getId() == R.id.b3){
            //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.2 2.1")); //.class és l'arxiu java compilat
            //startActivity(intent);
            Intent intent3 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent3.putExtra(SearchManager.QUERY, textBuscar.getText());
            startActivity(intent3);
        }
    }
}
