package com.example.jonathan.healthhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class questionprompt extends AppCompatActivity {

     String[] questions={
            "What is today’s date?",
            "How many nickels are in 60 cents?",
            "You are buying $13.75 of groceries. How much change would you receive from a $20 bill?",
            "What did you eat for your last meal?",
            "Who is the president of the United States?",
            "How many dimes are in $2?",
            "How old are you?",
            "Where do you live?",
            "How many quarters are in $8.75 cents?",
            "How are a bicycle and train alike? They are both ____ ?",
            "Name 5 fruits.",
            "Where do you go to buy medicines?",
            "Spell “WORLD” backwards.",
            "What state are you in now?",
            "Repeat the phrase: No ifs, ands or buts.",
            "Name 4 flowers."
    };
    int index = 0;
    int count = 0;
    int seed = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionprompt);
        count = getIntent().getIntExtra("Count",0);
        seed = getIntent().getIntExtra("Seed", 0);
        index =(count+seed)%questions.length;
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(questions[index]);
    }

    public void Correct(View view){
        Intent intent;
        if(count == 0){
            intent = new Intent(this, clockDrawinstruc.class);
        }
        else{
            intent = new Intent(this, questionprompt.class);
            intent.putExtra("Count",--count);
            intent.putExtra("Seed", seed);
        }
        startActivity(intent);

    }
    public void Incorrect(View view){
        Intent intent;
        if(count == 0){
            intent = new Intent(this, clockDrawinstruc.class);
        }
        else{
            intent = new Intent(this, questionprompt.class);
            intent.putExtra("Count",--count);
            intent.putExtra("Seed", seed);
        }
        startActivity(intent);

    }


}
