package com.example.jonathan.healthhack;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class clockDrawinstruc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_drawinstruc);
        TextView t = (TextView) findViewById(R.id.textView3);
        t.append((new Random().nextInt(12)+1) + ":" + new Random().nextInt(6) + "0");
    }
    static final int REQUEST_IMAGE_CAPTURE = 1;
    public void skipClick(View v) {
        startActivity(new Intent(clockDrawinstruc.this, caretakersurvey.class));

    }
    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } else {
            return;
        }
        TextView t = (TextView) findViewById(R.id.textView3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setText("Successfully took photo!");
        ((Button) findViewById(R.id.button6)).setText("Confirm");
        ((Button) findViewById(R.id.button6)).setBackgroundColor(-16711936);
        ((Button) findViewById(R.id.button6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(clockDrawinstruc.this, caretakersurvey.class));

            }
        });

    }
}
