package com.example.everydaydifferentmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private Button Button_event;
    private ImageView Change_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button_event = (Button)findViewById(R.id.button);
        Change_image = (ImageView)findViewById(R.id.imageView);
    }

    public void onClick(View view) {
        Change_image.setImageResource(R.drawable.a);
        Change_image.setImageResource(R.drawable.b);
        Change_image.setImageResource(R.drawable.c);
    }
}