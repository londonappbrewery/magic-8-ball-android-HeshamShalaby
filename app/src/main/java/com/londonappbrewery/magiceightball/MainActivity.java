package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static android.R.id.button2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballImage;
        ballImage = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.mipmap.ball1, R.mipmap.ball2, R.mipmap.ball3, R.mipmap.ball4, R.mipmap.ball5 };
        Button askButt;
        askButt = (Button) findViewById(R.id.button2);
        askButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magiceightball", "Ah Please");
                Random randomanswergenerator = new Random();
                int answer = randomanswergenerator.nextInt(5);
                Log.d("Fuck me", "the number of the variable is: " + answer);
                ballImage.setImageResource(ballArray[answer]);
            }
        });

    }
}
