package com.example.jonathan.healthhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class caretakersurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caretakersurvey);
    }

    public void goToMenu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
