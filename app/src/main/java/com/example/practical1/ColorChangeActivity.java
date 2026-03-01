package com.example.practical1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ColorChangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);
        Button colorButton = findViewById(R.id.colorButton);
        Random random = new Random();

        colorButton.setOnClickListener(v -> {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            mainLayout.setBackgroundColor(Color.rgb(red, green, blue));
        });
    }
}
