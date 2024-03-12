package com.aisoft.embedvideoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/tsMakd5YcVM";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
                Toast.makeText(MainActivity.this, "Video 01", Toast.LENGTH_SHORT).show();

            }
        });




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/CPZx_bsbOnk";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
                Toast.makeText(MainActivity.this, "Video 02", Toast.LENGTH_SHORT).show();

            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/UNKJYfwvxVM";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
                Toast.makeText(MainActivity.this, "Video 03", Toast.LENGTH_SHORT).show();

            }
        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}