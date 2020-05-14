package com.example.magicbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton TryMe;
    View MainView;
    int []arr = new int[]{Color.RED, Color.GREEN, Color.BLUE, Color.blue(898), Color.GRAY, Color.MAGENTA,
            Color.DKGRAY, Color.WHITE,  Color.YELLOW, Color.CYAN, Color.BLACK,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainView = findViewById(R.id.view1);
        TryMe = (ImageButton) findViewById(R.id.btn1);

        TryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int ran = random.nextInt(arr.length);
                MainView.setBackgroundColor(arr[ran]);

            }
        });

    }
}
