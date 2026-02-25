package com.example.practical1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLinear)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, LinearLayoutActivity.class)));

        findViewById(R.id.btnRelative)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, RelativeLayoutActivity.class)));

        findViewById(R.id.btnConstraint)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, ConstraintLayoutActivity.class)));

        findViewById(R.id.btnFrame)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, FrameLayoutActivity.class)));

        findViewById(R.id.btnScroll)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, ScrollViewActivity.class)));

        findViewById(R.id.btnTable)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, TableLayoutActivity.class)));

        findViewById(R.id.btnColor)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, ColorChangeActivity.class)));

        findViewById(R.id.btnProfile)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, ProfileActivity.class)));
    }
}