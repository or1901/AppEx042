package com.example.appex042;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton imageBtn;
    int num;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageBtn = findViewById(R.id.imageBtn);
        iv = findViewById(R.id.iv);

        imageBtn.setBackgroundColor(Color.WHITE);
    }

    public void randomImage(View view) {
        num = rnd.nextInt(3) + 1;
        switch(num)
        {
            case 1:
                imageBtn.setImageResource(R.drawable.one);
                iv.setImageResource(R.drawable.electrobunny);
                break;
            case 2:
                imageBtn.setImageResource(R.drawable.two);
                iv.setImageResource(R.drawable.orbit);
                break;
            case 3:
                imageBtn.setImageResource(R.drawable.three);
                iv.setImageResource(R.drawable.roboactive);
                break;
        }
    }
}