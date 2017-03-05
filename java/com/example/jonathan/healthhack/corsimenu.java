package com.example.jonathan.healthhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class corsimenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsimenu);
    }
    public void gotogame(View view){
        Intent intent = new Intent(this, corsigame.class);
        startActivity(intent);
    }
}
