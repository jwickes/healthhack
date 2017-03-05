package com.example.jonathan.healthhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class corsigame extends AppCompatActivity {

    int sequencelength = 3;
    int lives = 0;
    boolean repeat = false;
    int[] sequence;
    Button[] buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsigame);
        buttons = new Button[] {(Button)findViewById(R.id.corsi0),
                (Button)findViewById(R.id.corsi1),(Button)findViewById(R.id.corsi2),
                (Button)findViewById(R.id.corsi3),(Button)findViewById(R.id.corsi4),
                (Button)findViewById(R.id.corsi5),(Button)findViewById(R.id.corsi6)};
        try {
            runtest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void runtest() throws InterruptedException {
                int nextbutton = 0;
                int numbuttons = buttons.length;
                sequence = new int[sequencelength];
                for (int i = 0; i < sequencelength; i++) {
                    nextbutton = new Random().nextInt(numbuttons);
                    buttons[nextbutton].setBackgroundColor(-256);
                    sequence[i] = nextbutton;
                }
            }
        };

