package com.example.jonathan.healthhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import java.util.Random;

import static com.example.jonathan.healthhack.R.id.button2;


public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void startQuestions(View view){
        Intent intent = new Intent(this, questionprompt.class);
        intent.putExtra("Count", 5);
        intent.putExtra("Record",findViewById(R.id.checkBox).isActivated());
        intent.putExtra("Seed", new Random().nextInt(7) );
        startActivity(intent);

    }
}
